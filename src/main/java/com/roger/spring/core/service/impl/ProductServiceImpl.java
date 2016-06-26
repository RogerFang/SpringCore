package com.roger.spring.core.service.impl;

import com.roger.spring.core.model.Product;
import com.roger.spring.core.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * Created by Roger on 2016/6/26.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product findOne(Integer id) {
        System.out.println("ProductService findOne: "+id);
        return null;
    }

    @Override
    public Product save(Product product) {
        System.out.println("ProductService save: "+product);
        return null;
    }

    @Override
    public int delete(Integer id) {
        System.out.println("ProductService delete: "+id);
        return 0;
    }

    @Override
    public int update(Integer id) {
        System.out.println("ProductService update: "+id);
        return 0;
    }
}
