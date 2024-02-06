package com.test.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.test.dao.OTPRepository;
import com.test.dto.OTP;

@Service
public class OTPService {

    @Autowired
    private OTPRepository otpRepository;

    @Autowired
    private JavaMailSender javaMailSender;

    public String generateOTP(String email) {
        // Generate and store OTP in the database
        String generatedOTP = generateRandomOTP();
        OTP otp = new OTP();
        otp.setUsername(email);
        otp.setOtpValue(generatedOTP);
        otpRepository.save(otp);
        return generatedOTP;
    }

    public boolean verifyOTP(String email, String enteredOTP) {
        Optional<OTP> storedOTP = otpRepository.findByUsername(email);
        return storedOTP.map(otp -> otp.getOtpValue().equals(enteredOTP)).orElse(false);
    }

    private String generateRandomOTP() {
        // Generate a random 6-digit OTP for simplicity
        return String.format("%06d", new Random().nextInt(999999));
    }

    public void sendOTP(String to, String otp) {
        // Implement logic to send OTP via email using JavaMailSender
        // For simplicity, this example assumes a basic text email
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(to);
        mailMessage.setSubject("OTP Verification");
        mailMessage.setText("Your OTP is: " + otp);
        javaMailSender.send(mailMessage);
    }
}
