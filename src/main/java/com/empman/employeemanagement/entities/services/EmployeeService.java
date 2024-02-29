package com.empman.employeemanagement.entities.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empman.employeemanagement.entities.EmployeeEntity;
import com.empman.employeemanagement.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    /**
     * Dependency injection
     */
    private EmployeeRepository repository;
    private EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    /**
     * Find all employees in repository
     */
    public List<EmployeeEntity> findAll(){
        return repository.findAll();
    }
}
