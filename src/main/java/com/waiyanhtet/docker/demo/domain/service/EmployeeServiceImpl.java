package com.waiyanhtet.docker.demo.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.waiyanhtet.docker.demo.domain.entity.Employee;
import com.waiyanhtet.docker.demo.domain.repo.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee createEmployee(Employee e) {
		return repo.save(e);
	}

	@Override
	public Long updateEmployee(Employee e) {
		Optional<Employee> oldEmployee = repo.findById(e.getId());
		if(oldEmployee.isPresent()) {
			Employee emp = oldEmployee.get();
			emp.setName(e.getName());
			emp.setPhone(e.getPhone());
			emp.setEmail(e.getEmail());
			emp.setAddress(e.getAddress());
		}
		return e.getId();
	}

	@Override
	public Long deleteEmployee(Long id) {
		
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
		} 
		
		return id;
	}

	@Override
	public Employee retrieveEmployeeById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> retriveEmployee() {
		return repo.findAll();
	}

}
