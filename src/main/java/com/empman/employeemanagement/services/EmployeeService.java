package com.empman.employeemanagement.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empman.employeemanagement.entities.EmployeeEntity;
import com.empman.employeemanagement.repositories.EmployeeRepository;
import com.empman.employeemanagement.services.exceptions.RecordNotFoundException;

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

    /**
     * Find employee by id
     */
    public EmployeeEntity findById(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RecordNotFoundException(id));
    }

    /**
     * Insert new employee into repository
     */
    public EmployeeEntity insert(EmployeeEntity employee) {
        return repository.save(employee);
    }
}
