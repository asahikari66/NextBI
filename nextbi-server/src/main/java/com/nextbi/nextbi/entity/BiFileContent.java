package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

/**
 * 文件内容结构化存储表(BiFileContent)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@SuppressWarnings("serial")
@Data
public class BiFileContent extends Model<BiFileContent> {

    private Long id;
    //关联的数据集ID
    private Long datasetId;
    //存储单行解析后的JSON数据: {"city":"Sapporo", "temp": 22}
    @TableField(typeHandler = JacksonTypeHandler.class)
    private String dataJson;

    private Date createTime;


}

