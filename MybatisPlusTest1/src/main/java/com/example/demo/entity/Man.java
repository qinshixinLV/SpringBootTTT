package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "man")
public class Man {
    
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    @TableField(value = "name")
    private String name;
    
    @TableField(value = "age")
    private Byte age;
    
    public static final String COL_NAME = "name";
    
    public static final String COL_AGE = "age";
}