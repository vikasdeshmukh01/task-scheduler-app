package com.jsp.online.food.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.online.food.app.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
