package com.david.springbootmall.service;


import com.david.springbootmall.dto.ProductQueryParam;
import com.david.springbootmall.dto.ProductRequest;
import com.david.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParam productQueryParam);

    List<Product> getProducts(ProductQueryParam productQueryParam);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
