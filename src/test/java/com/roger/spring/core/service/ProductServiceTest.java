package com.roger.spring.core.service;

import com.roger.spring.core.ApplicationConfig;
import com.roger.spring.core.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Roger on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findOne() throws Exception {
        productService.findOne(1);
    }

    @Test
    public void save() throws Exception {
        productService.save(null);
    }

    @Test
    public void delete() throws Exception {
        productService.delete(1);
    }

    @Test
    public void update() throws Exception {
        productService.update(1);
    }

}