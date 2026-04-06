package com.example.dvsupportbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dvsupportbackend.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}