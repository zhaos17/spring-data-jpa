package com.example.jpa.repository;

import com.example.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: zhaos
 * @date: 2020/12/29
 */
public interface UserRepository extends JpaRepository<User, String> {
}
