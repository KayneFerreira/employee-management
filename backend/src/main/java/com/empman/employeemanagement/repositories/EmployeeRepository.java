package com.empman.employeemanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empman.employeemanagement.entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
