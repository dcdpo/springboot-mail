package com.david.springbootmall.service;

import com.david.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}