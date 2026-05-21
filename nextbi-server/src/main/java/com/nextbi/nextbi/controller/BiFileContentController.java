package com.nextbi.nextbi.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.entity.BiFileContent;
import com.nextbi.nextbi.service.BiFileContentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;



/**
 * 文件内容结构化存储表(BiFileContent)表控制层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@CrossOrigin
@RestController
@RequestMapping("biFileContent")
public class BiFileContentController {
    @Resource
    private BiFileContentService biFileContentService;

}

