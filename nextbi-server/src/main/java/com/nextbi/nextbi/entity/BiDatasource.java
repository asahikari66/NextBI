package com.nextbi.nextbi.entity;

import java.util.Date;
import java.util.Map;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 数据源配置表(BiDatasource)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@SuppressWarnings("serial")
@Data
@TableName(value = "bi_datasource",autoResultMap = true)
public class BiDatasource extends Model<BiDatasource> {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;
    private String name;
    private String type;
    @TableField(typeHandler = JacksonTypeHandler.class)
    private Map<String,Object> connConfig;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date createTime;


}

