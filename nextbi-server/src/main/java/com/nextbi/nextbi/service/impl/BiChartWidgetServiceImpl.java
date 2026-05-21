package com.nextbi.nextbi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nextbi.nextbi.dao.BiChartWidgetDao;
import com.nextbi.nextbi.entity.BiChartWidget;
import com.nextbi.nextbi.service.BiChartWidgetService;
import org.springframework.stereotype.Service;

/**
 * 图表组件表(BiChartWidget)表服务实现类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@Service("biChartWidgetService")
public class BiChartWidgetServiceImpl extends ServiceImpl<BiChartWidgetDao, BiChartWidget> implements BiChartWidgetService {

}

