package com.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.RegisteredUserRepository;
import com.test.dto.RegisteredUser;
import com.test.dto.TempUser;

@Service
public class RegisteredUserService {

    @Autowired
    private RegisteredUserRepository registeredUserRepository;

    public Optional<RegisteredUser> findByEmail(String email) {
        return registeredUserRepository.findByEmail(email);
    }

    public RegisteredUser registerNewUser(TempUser tempUser) {
        // Create a new RegisteredUser using data from TempUser
        RegisteredUser registeredUser = new RegisteredUser();
        registeredUser.setEmail(tempUser.getEmail());
        // Copy other relevant fields...

        // Save the new user in the registered users table
        return registeredUserRepository.save(registeredUser);
    }
}
