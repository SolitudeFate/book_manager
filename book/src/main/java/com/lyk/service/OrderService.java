package com.lyk.service;

import com.lyk.pojo.Cart;
import com.lyk.pojo.Order;

import java.util.List;

public interface OrderService {
    public String createOrder(Cart cart, Integer userId);

    List<Order> myOrders(Integer userId);

    Order orderDetails(String orderId);

    List<Order> allOrders();

    int sendOrder(String orderId);

    int receiveOrder(String orderId);


}
