package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

/**
 * 数据集表(BiDataset)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@SuppressWarnings("serial")
@Data
public class BiDataset extends Model<BiDataset> {

    private Long id;
    //关联的数据源ID
    private Long datasourceId;
    //数据集名称
    private String name;
    //数据来源: SQL(数据库), FILE(上传文件)
    private String sourceType;
    //如果是数据库，存储SQL查询语句
    private String sqlQuery;
    //字段元数据: [{name: "sale", alias: "销量", type: "number"}]
    @TableField(typeHandler = JacksonTypeHandler.class)
    private String fieldMeta;

    private Date createTime;


}

