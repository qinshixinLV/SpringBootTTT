package com.example.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/getOne")
    public void getOne(){
        EntityWrapper entityWrapper = new EntityWrapper();
        entityWrapper.eq("id",6);
        Product product = productService.selectOne(entityWrapper);
        System.out.println(product.toString());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(product.getCreateTime()));
        System.out.println(dateFormat.format(product.getUpdateTime()));
        System.out.println(dateFormat.format(product.getShowDay()));
        System.out.println(dateFormat.format(product.getShowTime()));
    }
}
