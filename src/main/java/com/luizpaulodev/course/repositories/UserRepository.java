package com.luizpaulodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizpaulodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
