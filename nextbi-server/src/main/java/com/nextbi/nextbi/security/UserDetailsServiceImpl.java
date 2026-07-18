package com.nextbi.nextbi.security;

import com.nextbi.nextbi.dao.SysUserDao;
import com.nextbi.nextbi.entity.SysUser;
import com.nextbi.nextbi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    // 核心修改点：不注入 Service，注入 DAO
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 使用 DAO 直接查询，避开 Service 层
        SysUser sysUser = sysUserDao.selectOne(
                new com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper<SysUser>()
                        .eq(SysUser::getUsername, username)
        );

        if (sysUser == null) {
            throw new UsernameNotFoundException("用户不存在");
        }

        return new User(sysUser.getUsername(), sysUser.getPassword(), new ArrayList<>());
    }
}