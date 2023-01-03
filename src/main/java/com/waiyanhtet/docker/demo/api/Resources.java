package com.waiyanhtet.docker.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.waiyanhtet.docker.demo.domain.entity.Employee;
import com.waiyanhtet.docker.demo.domain.service.EmployeeService;

@RestController
public class Resources {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Hello from Server", HttpStatus.OK);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee() {
		return service.retriveEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return service.retrieveEmployeeById(id);
	}
	
	@PostMapping("/employee")
	public Long createEmployee(@RequestBody Employee e) {
		 Employee emp = service.createEmployee(e);
		 return emp.getId();
	}
	
	@DeleteMapping("/employee/{id}")
	public Long deleteEmployee(@PathVariable Long id) {
		return service.deleteEmployee(id);
	}
}
