package com.nextbi.nextbi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextbi.nextbi.entity.BiFileContent;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件内容结构化存储表(BiFileContent)表服务接口
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */

public interface BiFileContentService extends IService<BiFileContent> {

    /**
     * 上传并解析 CSV 文件入库
     * @param file 上传的文件对象
     * @param userId 当前操作的用户ID
     * @return 解析并保存后的实体类对象
     */
    BiFileContent uploadAndParseCsv(MultipartFile file, Long userId);
}

