package com.nextbi.nextbi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nextbi.nextbi.dto.SysUser.LoginDTO;
import com.nextbi.nextbi.dto.SysUser.RegisterDTO;
import com.nextbi.nextbi.entity.SysUser;

/**
 * 系统用户表(SysUser)表服务接口
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
public interface SysUserService extends IService<SysUser> {
    String login(LoginDTO loginDTO);
    String register(RegisterDTO  registerDTO);
}

