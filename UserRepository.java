package com.example.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringProject.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}