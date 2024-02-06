package com.test.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.OTPVerificationRequest;
import com.test.dto.RegisteredUser;
import com.test.dto.TempUser;
import com.test.dto.UserRegistrationRequest;
import com.test.service.EventRegistrationService;
import com.test.service.OTPService;
import com.test.service.RegisteredUserService;
import com.test.service.TempUserService;

// UserController.java
@RestController
public class UserController {
	
	
public UserController() {
	System.out.println("Inside UserController");
}	
    @Autowired
    private RegisteredUserService registeredUserService;

    @Autowired
    private TempUserService tempUserService;

    @Autowired
    private OTPService otpService;

    @Autowired
    private EventRegistrationService eventRegistrationService;

    // Endpoint for user registration (checking if the email exists)
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
    	
    	System.out.println("Inside registerUser ");
        String email = registrationRequest.getEmail();
        // Check if the email exists in the registered users table
        Optional<RegisteredUser> existingUser = registeredUserService.findByEmail(email);

        if (existingUser.isPresent()) {
            // User already exists, generate and send OTP
            String generatedOTP = otpService.generateOTP(email);
            otpService.sendOTP(email, generatedOTP);

            return ResponseEntity.ok("OTP sent to the registered email address");
        } else {
            // User does not exist, create a temp user entry and send OTP
            tempUserService.createTempUser(email);
            String generatedOTP = otpService.generateOTP(email);
            otpService.sendOTP(email, generatedOTP);

            return ResponseEntity.ok("OTP sent to the provided email address");
        }
    }

    // Endpoint for verifying OTP and registering the event
    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOTP(@RequestBody OTPVerificationRequest otpVerificationRequest) {
        String email = otpVerificationRequest.getEmail();
        String enteredOTP = otpVerificationRequest.getOtp();

        // Verify OTP
        if (otpService.verifyOTP(email, enteredOTP)) {
            // OTP verification successful, check if the user is in temp or registered users
            Optional<RegisteredUser> registeredUser = registeredUserService.findByEmail(email);
            if (registeredUser.isPresent()) {
                // User is registered, register the event
                eventRegistrationService.registerEvent(registeredUser.get());
            } else {
                // User is not registered, fetch from temp and register the event
                TempUser tempUser = tempUserService.findByEmail(email)
                        .orElseThrow(() -> new RuntimeException("Temp user not found"));

                RegisteredUser newRegisteredUser = registeredUserService.registerNewUser(tempUser);
                eventRegistrationService.registerEvent(newRegisteredUser);
            }

            return ResponseEntity.ok("Event registered successfully");
        } else {
            // OTP verification failed, return an appropriate response
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid OTP");
        }
    }
}
