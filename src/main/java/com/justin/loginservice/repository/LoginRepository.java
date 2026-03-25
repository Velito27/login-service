package com.justin.loginservice.repository;

import com.justin.loginservice.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
