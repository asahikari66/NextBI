package com.nextbi.nextbi.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.common.Result;
import com.nextbi.nextbi.dto.SysUser.LoginDTO;
import com.nextbi.nextbi.dto.SysUser.RegisterDTO;
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
@RequestMapping("/api/sysUser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginDTO loginDTO) {
        try {
            String token = sysUserService.login(loginDTO);
            return Result.success(token);
        }
        catch (Exception e) {
            return Result.error(401,"登陆失败，账号密码错误");
        }
    }

    @PostMapping("/register")
    public Result<String> register(@RequestBody RegisterDTO registerDTO) {
        try {
            String message = sysUserService.register(registerDTO);
            return Result.success(message);
        }
        catch (Exception e) {
            return Result.error(500,e.getMessage());
        }
    }
}

