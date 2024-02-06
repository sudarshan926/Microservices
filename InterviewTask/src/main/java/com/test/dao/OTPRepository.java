package com.test.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.dto.OTP;

// OTPRepository.java
public interface OTPRepository extends JpaRepository<OTP, Long> {
    Optional<OTP> findByUsername(String username);
}
