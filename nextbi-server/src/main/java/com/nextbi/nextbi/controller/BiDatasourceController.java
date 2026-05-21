package com.nextbi.nextbi.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.entity.BiDatasource;
import com.nextbi.nextbi.service.BiDatasourceService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;



/**
 * 数据源配置表(BiDatasource)表控制层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@CrossOrigin
@RestController
@RequestMapping("biDatasource")
public class BiDatasourceController {
    @Resource
    private BiDatasourceService biDatasourceService;

}

