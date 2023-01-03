package com.waiyanhtet.docker.demo.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.waiyanhtet.docker.demo.domain.entity.Employee;

@Service
public interface EmployeeService {

	Employee createEmployee(Employee e);
	
	Long updateEmployee(Employee e);
	
	Long deleteEmployee(Long id);
	
	Employee retrieveEmployeeById(Long id);
	
	List<Employee> retriveEmployee();
}
