package com.nextbi.nextbi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nextbi.nextbi.entity.BiFileContent;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件内容结构化存储表(BiFileContent)表数据库访问层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Mapper
public interface BiFileContentDao extends BaseMapper<BiFileContent> {

}

