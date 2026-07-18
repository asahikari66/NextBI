package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 仪表盘表(BiDashboard)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@SuppressWarnings("serial")
@Data
@TableName(value = "bi_dashboard",autoResultMap = true)
public class BiDashboard extends Model<BiDashboard> {
    @TableId(type = IdType.AUTO)
    private Long id;
    //创建者ID
    private Long userId;
    //报表标题
    private String title;
    //主题颜色
    private String theme;
    //是否公开: 0-私有, 1-公开
    private Integer isPublic;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date updateTime;


}

