package com.nextbi.nextbi.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.entity.BiChartWidget;
import com.nextbi.nextbi.service.BiChartWidgetService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;



/**
 * 图表组件表(BiChartWidget)表控制层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:03
 */
@CrossOrigin
@RestController
@RequestMapping("biChartWidget")
public class BiChartWidgetController {
    @Resource
    private BiChartWidgetService biChartWidgetService;

}

