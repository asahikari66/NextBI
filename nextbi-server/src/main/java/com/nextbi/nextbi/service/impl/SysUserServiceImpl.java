package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.SysUserDao;
import com.nextbi.nextbi.dto.SysUser.LoginDTO;
import com.nextbi.nextbi.dto.SysUser.RegisterDTO;
import com.nextbi.nextbi.entity.SysUser;
import com.nextbi.nextbi.service.SysUserService;
import com.nextbi.nextbi.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.net.Authenticator;

/**
 * 系统用户表(SysUser)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtils jwtUtils;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public String login(LoginDTO loginDTO) {
        // 1. 将前端传来的账号密码封装成 Spring Security 认识的 Token 对象
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword());

        // 2. 交给安保经理去自动校验（如果密码错误或账号不存在，这里会自动抛出异常）
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        // 3. 如果校验通过，调用我们自己的发牌机生成 JWT Token
         authenticate.getName();//获取到的就是登录成功的用户名
        return jwtUtils.generateToken(authenticate.getName());
    }

    @Override
    public String register(RegisterDTO registerDTO) {
        // 1. 检查用户名是否已存在
        SysUser existingUser = sysUserDao.selectOne(
                new LambdaQueryWrapper<SysUser>().eq(SysUser::getUsername, registerDTO.getUsername())
        );

        if (existingUser != null) {
            throw new RuntimeException("注册失败：用户名已存在");
        }

        // 2. 封装用户实体
        SysUser user = new SysUser();
        user.setUsername(registerDTO.getUsername());
        // 关键点：使用密码加密器进行加密，千万不要明文存入数据库！
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        user.setEmail(registerDTO.getEmail());

        // 3. 存入数据库
        int result = sysUserDao.insert(user);

        return result > 0 ? "注册成功" : "注册失败";
    }
}

