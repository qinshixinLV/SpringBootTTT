package com.example.demo;

import com.example.demo.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TranTest extends DemoApplicationTests {
    @Autowired
    ProductService productService;

    @Test
    public void name() throws Exception {
        productService.methodFu();
    }

    @Test
    public void name2() throws Exception {
        productService.methodZi();
    }
}
