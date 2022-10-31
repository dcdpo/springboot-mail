package com.david.springbootmall.service;

import com.david.springbootmall.dto.CreateOrderRequest;
import com.david.springbootmall.dto.OrderQueryParams;
import com.david.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
