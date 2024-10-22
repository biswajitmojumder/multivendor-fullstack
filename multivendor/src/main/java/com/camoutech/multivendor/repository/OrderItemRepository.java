package com.camoutech.multivendor.repository;

import com.camoutech.multivendor.model.Order;
import com.camoutech.multivendor.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
