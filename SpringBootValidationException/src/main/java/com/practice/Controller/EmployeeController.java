package com.practice.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Service.EmployeeService;
import com.practice.dto.Employee;

import jakarta.validation.Valid;


@RestController

public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	public ResponseEntity<Employee> CreateEmployee(@RequestBody @Valid Employee e) {
		
		return new ResponseEntity( service.CreateService(e),HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
      public List<Employee> GetEmployee() {	
	return service.GetAllService();
	}
      @DeleteMapping("/delete")
      public List<Employee> DeleteEmployee(int id) {
    	return   service.DeleteService(id);
      }
      
     
}
