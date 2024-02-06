package com.test.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.dto.RegisteredUser;




public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Long> {
    Optional<RegisteredUser> findByEmail(String email);
}
