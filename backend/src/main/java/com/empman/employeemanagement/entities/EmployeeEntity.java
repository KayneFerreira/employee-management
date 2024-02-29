package com.empman.employeemanagement.entities;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "funcionario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(length = 11)
    private String cpf;

    @Email
    private String email;

    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeAddress address;

    private String department;

    private String position;

    private BigDecimal salary;

}
