package com.practice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dto.Employee;
import com.practice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emp;
	
	public Employee CreateService(Employee e) {
	return	emp.save(e);
	}
	
	public  List <Employee>GetAllService() {
		return emp.findAll();	
	}
	
	public List<Employee> DeleteService(int id) {
		return emp.findAll();	
	}

}
