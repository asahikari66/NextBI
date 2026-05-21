package com.nextbi.nextbi.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.entity.BiDashboard;
import com.nextbi.nextbi.service.BiDashboardService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;



/**
 * 仪表盘表(BiDashboard)表控制层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@CrossOrigin
@RestController
@RequestMapping("biDashboard")
public class BiDashboardController {
    @Resource
    private BiDashboardService biDashboardService;

}

