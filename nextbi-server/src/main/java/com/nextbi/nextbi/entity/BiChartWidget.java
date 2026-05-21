package com.nextbi.nextbi.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;

/**
 * 图表组件表(BiChartWidget)表实体类
 *
 * @author asahikari66
 * @since 2026-05-21 16:01:04
 */
@SuppressWarnings("serial")
@Data
public class BiChartWidget extends Model<BiChartWidget> {

    private Long id;
    //所属仪表盘
    private Long dashboardId;
    //引用的数据集
    private Long datasetId;
    //组件标题
    private String title;
    //图表类型: bar, line, pie, map
    private String type;
    //ECharts特定配置参数
    @TableField(typeHandler = JacksonTypeHandler.class)
    private String chartConfig;
    //拖拽布局参数: {x, y, w, h, i}
    @TableField(typeHandler = JacksonTypeHandler.class)
    private String layoutConfig;

    private Date createTime;


}

