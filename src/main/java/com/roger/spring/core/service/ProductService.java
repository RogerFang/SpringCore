package com.roger.spring.core.service;

import com.roger.spring.core.model.Product;

/**
 * Created by Roger on 2016/6/26.
 */
public interface ProductService {

    public Product findOne(Integer id);

    public Product save(Product product);

    public int delete(Integer id);

    public int update(Integer id);
}
