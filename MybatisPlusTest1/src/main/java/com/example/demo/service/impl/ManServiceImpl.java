package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.ManMapper;
import com.example.demo.entity.Man;
import com.example.demo.service.ManService;
import org.springframework.stereotype.Service;

@Service
public class ManServiceImpl extends ServiceImpl<ManMapper, Man> implements ManService {

}
