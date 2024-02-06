package com.test.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.dto.TempUser;

// TempUserRepository.java
public interface TempUserRepository extends JpaRepository<TempUser, Long> {
    Optional<TempUser> findByEmail(String email);
}
