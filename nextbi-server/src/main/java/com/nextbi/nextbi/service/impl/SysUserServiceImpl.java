package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.SysUserDao;
import com.nextbi.nextbi.entity.SysUser;
import com.nextbi.nextbi.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 系统用户表(SysUser)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

}

