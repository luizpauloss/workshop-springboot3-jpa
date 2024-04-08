package com.luizpaulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizpaulodev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}