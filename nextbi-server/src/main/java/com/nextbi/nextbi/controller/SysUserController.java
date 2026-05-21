package com.nextbi.nextbi.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.entity.SysUser;
import com.nextbi.nextbi.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;



/**
 * 系统用户表(SysUser)表控制层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@CrossOrigin
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

}

