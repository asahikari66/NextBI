package com.nextbi.nextbi.entity;

import java.util.Date;
import java.util.Map;
import java.util.Objects;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 文件内容结构化存储表(BiFileContent)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@SuppressWarnings("serial")
@Data
@TableName(value = "bi_file_content",autoResultMap = true)
public class BiFileContent extends Model<BiFileContent> {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long datasetId;

    @TableField(typeHandler = JacksonTypeHandler.class)
    private Map<String, Objects> dataJson;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date createTime;


}

