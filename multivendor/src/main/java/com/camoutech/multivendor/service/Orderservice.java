package com.camoutech.multivendor.service;

import com.camoutech.multivendor.domain.OrderStatus;
import com.camoutech.multivendor.model.*;

import java.util.List;
import java.util.Set;

public interface Orderservice {

    Set<Order> createOrder(User user, Address shippingAddress, Cart cart);
    Order findOrderById(Long id) throws Exception;
    List<Order> usersOrderHistory(Long userId);
    List<Order> sellersOrder(Long sellerId);
    Order updateOrderStatus(Long orderId, OrderStatus orderStatus) throws Exception;
    Order cancelOrder(Long orderId, User user) throws Exception;
    OrderItem getOrderItemById(Long id) throws Exception;
}
