package com.test.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.EventRegistrationRepository;
import com.test.dto.EventRegistration;
import com.test.dto.RegisteredUser;

@Service
public class EventRegistrationService {

    @Autowired
    private EventRegistrationRepository eventRegistrationRepository;

    public void registerEvent(RegisteredUser registeredUser) {
        // Register the event for the user
        EventRegistration eventRegistration = new EventRegistration();
        eventRegistration.setRegisteredUser(registeredUser);
        eventRegistration.setCreateDate(LocalDateTime.now());
        eventRegistrationRepository.save(eventRegistration);
    }
}
