package com.nextbi.nextbi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nextbi.nextbi.entity.BiChartWidget;
import org.apache.ibatis.annotations.Mapper;

/**
 * 图表组件表(BiChartWidget)表数据库访问层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Mapper
public interface BiChartWidgetDao extends BaseMapper<BiChartWidget> {

}

