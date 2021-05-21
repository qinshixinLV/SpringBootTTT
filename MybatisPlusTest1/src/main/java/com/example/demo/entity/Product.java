package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@TableName(value = "product")
public class Product {
     @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "product_name")
    private String productName;

    @TableField(value = "brand_id")
    private Integer brandId;

    /**
     * 数量
     */
    @TableField(value = "num")
    private Long num;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Timestamp createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 展示日期
     */
    @TableField(value = "show_day")
    private Date showDay;

    @TableField(value = "show_time")
    private Date showTime;

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_BRAND_ID = "brand_id";

    public static final String COL_NUM = "num";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_SHOW_DAY = "show_day";

    public static final String COL_SHOW_TIME = "show_time";
}