package com.nextbi.nextbi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nextbi.nextbi.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户表(SysUser)表数据库访问层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUser> {

}

