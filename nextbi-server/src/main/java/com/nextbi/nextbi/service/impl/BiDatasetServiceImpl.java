package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.BiDatasetDao;
import com.nextbi.nextbi.entity.BiDataset;
import com.nextbi.nextbi.service.BiDatasetService;
import org.springframework.stereotype.Service;

/**
 * 数据集表(BiDataset)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Service("biDatasetService")
public class BiDatasetServiceImpl extends ServiceImpl<BiDatasetDao, BiDataset> implements BiDatasetService {

}

