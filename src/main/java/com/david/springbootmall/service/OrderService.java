package com.david.springbootmall.service;

import com.david.springbootmall.dto.CreateOrderRequest;
import com.david.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
