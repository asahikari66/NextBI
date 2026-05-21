package com.nextbi.nextbi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nextbi.nextbi.entity.BiDashboard;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仪表盘表(BiDashboard)表数据库访问层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Mapper
public interface BiDashboardDao extends BaseMapper<BiDashboard> {

}

