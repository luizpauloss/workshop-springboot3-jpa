package com.luizpaulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizpaulodev.course.entities.OrderItem;
import com.luizpaulodev.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}