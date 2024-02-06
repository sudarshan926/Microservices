package com.tech.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tech.entity.CustomerDetails;

//@FeignClient(url = "http://localhost:8005", value ="CustomerDetails-Client")
@FeignClient(name="CUSTEMERDETAILS-SERVICE")

public interface FignClient {
    
    @GetMapping("/CustomerDetails/custom/{customerId}")
    List<CustomerDetails> getCustomerOfcustomerDetails(@PathVariable("customerId") long customerId);
}
