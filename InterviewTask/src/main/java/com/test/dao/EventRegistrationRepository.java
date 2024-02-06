package com.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.dto.EventRegistration;

// EventRegistrationRepository.java
public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Long> {
    // Additional queries if needed
}
