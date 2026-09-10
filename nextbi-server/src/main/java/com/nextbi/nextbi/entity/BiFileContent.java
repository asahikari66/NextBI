package com.nextbi.nextbi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Map;

/**
 * 文件内容结构化存储表(BiFileContent)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "bi_file_content", autoResultMap = true)
public class BiFileContent extends Model<BiFileContent> {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 文件名称 (如: sales_2026.csv)
     */
    private String fileName;

    /**
     * 文件类型 (如: csv, xml)
     */
    private String fileType;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 关联的数据集ID (可为空)
     */
    private Long datasetId;

    /**
     * 解析后的 JSON 结构化数据
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private Map<String, Object> dataJson;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}