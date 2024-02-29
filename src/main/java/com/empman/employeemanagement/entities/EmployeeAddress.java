package com.empman.employeemanagement.entities;

import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeAddress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String street;
    String city;
    String state;
    String country;

    @NumberFormat(pattern = "#####-###")
    String zipCode;

}
