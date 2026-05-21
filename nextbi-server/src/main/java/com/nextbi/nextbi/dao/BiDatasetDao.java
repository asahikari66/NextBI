package com.nextbi.nextbi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nextbi.nextbi.entity.BiDataset;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据集表(BiDataset)表数据库访问层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Mapper
public interface BiDatasetDao extends BaseMapper<BiDataset> {

}

