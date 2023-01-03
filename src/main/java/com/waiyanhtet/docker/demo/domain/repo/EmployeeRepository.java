package com.waiyanhtet.docker.demo.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waiyanhtet.docker.demo.domain.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
