package com.nextbi.nextbi.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nextbi.nextbi.common.Result;
import com.nextbi.nextbi.entity.BiFileContent;
import com.nextbi.nextbi.entity.SysUser;
import com.nextbi.nextbi.service.BiFileContentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件内容结构化存储表(BiFileContent)表控制层
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@CrossOrigin
@RestController
@RequestMapping("api/file")
public class BiFileContentController {
    @Resource
    private BiFileContentService biFileContentService;
    @PostMapping("/upload")
    public Result<BiFileContent> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            // 1. 从 Spring Security 上下文中获取当前登录的用户信息
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

            Long userId = 1L; // 默认测试 ID
            if (authentication != null && authentication.getPrincipal() instanceof SysUser) {
                SysUser user = (SysUser) authentication.getPrincipal();
                userId = user.getId();
            }

            // 2. 调用 Service 解析 CSV 并入库
            BiFileContent fileContent = biFileContentService.uploadAndParseCsv(file, userId);

            // 3. 返回统一响应结果
            return Result.success(fileContent);

        } catch (Exception e) {
            return Result.error(500,e.getMessage());
        }
    }
}

