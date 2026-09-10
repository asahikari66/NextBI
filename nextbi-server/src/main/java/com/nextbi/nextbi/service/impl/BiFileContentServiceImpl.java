package com.nextbi.nextbi.service.impl;

import cn.hutool.core.text.csv.CsvData;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvRow;
import cn.hutool.core.text.csv.CsvUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.BiFileContentDao;
import com.nextbi.nextbi.entity.BiFileContent;
import com.nextbi.nextbi.service.BiFileContentService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * 文件内容结构化存储表(BiFileContent)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Service("biFileContentService")
public class BiFileContentServiceImpl extends ServiceImpl<BiFileContentDao, BiFileContent> implements BiFileContentService {

    @Override
    public BiFileContent uploadAndParseCsv(MultipartFile file, Long userId) {
        // 1. 基础校验
        if (file == null || file.isEmpty()) {
            throw new RuntimeException("上传文件不能为空");
        }
        String fileName = file.getOriginalFilename();
        if (fileName == null || !fileName.endsWith(".csv")) {
            throw new RuntimeException("目前仅支持 .csv 格式的文件");
        }

        try {
            // 2. 使用 Hutool 读取并解析 CSV 内容
            CsvReader reader = CsvUtil.getReader();
            // 以 UTF-8 编码读取输入流
            CsvData csvData = reader.read(new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8));
            List<CsvRow> rows = csvData.getRows();

            if (rows == null || rows.isEmpty()) {
                throw new RuntimeException("CSV 文件无有效内容");
            }

            // 3. 提取表头 (Header) 对应第一行
            CsvRow headerRow = rows.get(0);
            List<String> headers = headerRow.getRawList();

            // 4. 解析数据行，转化为 Map 结构 List<Map<String, Object>>
            List<Map<String, Object>> parsedData = new ArrayList<>();
            for (int i = 1; i < rows.size(); i++) {
                CsvRow row = rows.get(i);
                List<String> rawList = row.getRawList();
                Map<String, Object> rowMap = new LinkedHashMap<>();

                for (int j = 0; j < headers.size(); j++) {
                    String headerName = headers.get(j);
                    // 动态对齐列与值，防越界
                    String cellValue = j < rawList.size() ? rawList.get(j) : "";
                    rowMap.put(headerName, cellValue);
                }
                parsedData.add(rowMap);
            }

            // 5. 组装最外层 Map（存入 Map 类型的 dataJson 字段）
            Map<String, Object> contentMap = new HashMap<>();
            contentMap.put("headers", headers);
            contentMap.put("total", parsedData.size());
            contentMap.put("items", parsedData);

            // 6. 构造 Entity 入库
            BiFileContent fileContent = new BiFileContent();
            fileContent.setFileName(fileName);
            fileContent.setFileType("csv");
            fileContent.setUserId(userId);
            fileContent.setDataJson(contentMap); // JacksonTypeHandler 会自动转为数据库中的 JSON 格式

            // 保存至 MySQL 数据库
            this.save(fileContent);

            return fileContent;

        } catch (Exception e) {
            throw new RuntimeException("文件解析或入库失败: " + e.getMessage(), e);
        }
    }
}

