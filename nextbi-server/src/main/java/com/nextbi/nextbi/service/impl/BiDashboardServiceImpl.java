package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.BiDashboardDao;
import com.nextbi.nextbi.entity.BiDashboard;
import com.nextbi.nextbi.service.BiDashboardService;
import org.springframework.stereotype.Service;

/**
 * 仪表盘表(BiDashboard)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Service("biDashboardService")
public class BiDashboardServiceImpl extends ServiceImpl<BiDashboardDao, BiDashboard> implements BiDashboardService {

}

