package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * 系统用户表(SysUser)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@SuppressWarnings("serial")
@Data
public class SysUser extends Model<SysUser> {
    //主键
    private Long id;
    //用户名
    private String username;
    //加密后的密码
    private String password;
    //邮箱
    private String email;
    //注册时间
    private Date createTime;

    private Date updateTime;


}

