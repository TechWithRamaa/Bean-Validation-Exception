package com.engineeringwithramaa.beanvalidationandexceptionhandling.repository;

import com.engineeringwithramaa.beanvalidationandexceptionhandling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
