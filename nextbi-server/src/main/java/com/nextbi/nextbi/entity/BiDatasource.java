package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * 数据源配置表(BiDatasource)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@SuppressWarnings("serial")
@Data
public class BiDatasource extends Model<BiDatasource> {

    private Long id;
    //所属用户ID
    private Long userId;
    //数据源名称
    private String name;
    //类型: MYSQL, POSTGRESQL, FILE(CSV/XML)
    private String type;
    //连接配置: {host, port, database, username, password}
    private String connConfig;

    private Date createTime;


}

