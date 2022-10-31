package com.david.springbootmall.dao;


import com.david.springbootmall.dto.ProductQueryParam;
import com.david.springbootmall.dto.ProductRequest;
import com.david.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParam productQueryParam);
    List<Product> getProducts(ProductQueryParam productQueryParam);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById(Integer productId);
}
