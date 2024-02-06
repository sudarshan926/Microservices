package com.example.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.EmployeeService;
import com.example.dto.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/create")
	public Employee CreateEmployee(@RequestBody Employee e) {
		return service.CreateService(e);
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
