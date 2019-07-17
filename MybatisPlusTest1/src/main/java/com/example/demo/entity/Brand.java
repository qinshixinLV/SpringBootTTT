package com.example.demo.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

@Data
@TableName(value = "brand")
public class Brand {
     @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "brand_name")
    private String brandName;

    public static final String COL_BRAND_NAME = "brand_name";
}