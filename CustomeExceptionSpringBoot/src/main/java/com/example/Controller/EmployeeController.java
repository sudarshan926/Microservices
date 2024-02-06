package com.example.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.EmployeeService;
import com.example.dto.Employee;

import Exception.EmailValidException;
import Exception.Error;
import Exception.NameValidException;

@RestController

public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	public Employee CreateEmployee(@RequestBody Employee e) {
		try {
		if(!e.getEmail().contains("@")) {
			throw new EmailValidException("Create email is wrong :"+e.getEmail());
		}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		if(!e.getName().contains("!")) {
			throw new NameValidException("Create Name is wrong"+e.getName());
		}
		
		
		return service.CreateService(e);
	}
	
	@ExceptionHandler(value=EmailValidException.class)
	public ResponseEntity<Error>emailValidation(EmailValidException exception){
		Error error=new Error(1000,exception.getMessage());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
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
