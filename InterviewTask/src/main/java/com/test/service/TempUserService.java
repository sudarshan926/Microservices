package com.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TempUserRepository;
import com.test.dto.TempUser;

@Service
public class TempUserService {

    @Autowired
    private TempUserRepository tempUserRepository;

    public Optional<TempUser> findByEmail(String email) {
        return tempUserRepository.findByEmail(email);
    }

    public void createTempUser(String email) {
        // Create a new TempUser entry
        TempUser tempUser = new TempUser();
        tempUser.setEmail(email);
        // Copy other relevant fields...

        // Save the temp user entry
        tempUserRepository.save(tempUser);
    }
}
