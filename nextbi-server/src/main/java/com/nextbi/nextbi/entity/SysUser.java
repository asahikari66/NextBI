package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 系统用户表(SysUser)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@SuppressWarnings("serial")
@Data
@TableName(value = "sys_user", autoResultMap = true)
public class SysUser extends Model<SysUser> {
    //主键
    @TableId(type = IdType.AUTO)
    private Long id;
    //用户名
    private String username;
    //加密后的密码
    private String password;
    //邮箱
    private String email;
    //注册时间
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date updateTime;


}

