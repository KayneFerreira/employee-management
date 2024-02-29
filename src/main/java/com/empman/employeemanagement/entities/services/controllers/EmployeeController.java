package com.empman.employeemanagement.entities.services.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.empman.employeemanagement.entities.EmployeeEntity;
import com.empman.employeemanagement.entities.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    /**
     * Dependency injection
     */
    private EmployeeService service;
    private EmployeeController(EmployeeService service) {
        this.service = service;
    }

    /**
     * Find all employees
     */
    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<EmployeeEntity> findAllEmployees() {
        return service.findAll();
    }
    
}
