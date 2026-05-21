package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.BiDatasourceDao;
import com.nextbi.nextbi.entity.BiDatasource;
import com.nextbi.nextbi.service.BiDatasourceService;
import org.springframework.stereotype.Service;

/**
 * 数据源配置表(BiDatasource)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Service("biDatasourceService")
public class BiDatasourceServiceImpl extends ServiceImpl<BiDatasourceDao, BiDatasource> implements BiDatasourceService {

}

