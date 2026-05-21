package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.BiFileContentDao;
import com.nextbi.nextbi.entity.BiFileContent;
import com.nextbi.nextbi.service.BiFileContentService;
import org.springframework.stereotype.Service;

/**
 * 文件内容结构化存储表(BiFileContent)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:05
 */
@Service("biFileContentService")
public class BiFileContentServiceImpl extends ServiceImpl<BiFileContentDao, BiFileContent> implements BiFileContentService {

}

