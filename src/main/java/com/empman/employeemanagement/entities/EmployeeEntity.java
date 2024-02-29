package com.empman.employeemanagement.entities;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @UniqueElements(message = "Este número de CPF já existe na base de dados.")
    @Column(length = 11)
    private String cpf;

    @UniqueElements(message = "Este endereço de email já existe na base de dados.")
    private String email;

    @UniqueElements(message = "Este número de telefone já existe na base de dados.")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeAddress address;

    private String department;

    private String position;

    private BigDecimal salary;

}
