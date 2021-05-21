package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.ProductMapper;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Transactional
    public void methodFu() throws Exception{
        Product product = new Product();
        product.setId(1);
        product.setBrandId(6);
        baseMapper.updateById(product);
        methodZi();
//        int i = 3/0;
    }

    @Transactional
    public void methodZi() throws Exception{
        Product product = new Product();
        product.setId(1);
        product.setNum(20000L);
        baseMapper.updateById(product);
            int i = 3/0;

    }
}
