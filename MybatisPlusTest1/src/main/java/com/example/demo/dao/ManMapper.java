package com.example.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Man;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManMapper extends BaseMapper<Man> {
}