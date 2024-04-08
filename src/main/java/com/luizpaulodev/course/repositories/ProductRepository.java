package com.luizpaulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizpaulodev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}