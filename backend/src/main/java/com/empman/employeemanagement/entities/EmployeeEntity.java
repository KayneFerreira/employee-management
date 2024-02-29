package com.empman.employeemanagement.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "Insira o nome completo do colaborador")
    private String name;

    @Column(length = 11, unique = true)
    @NotBlank(message = "Insira um número de CPF válido")
    private String cpf;

    @Email
    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeAddress address;

    @NotBlank(message = "Insira o departamento do colaborador")
    private String department;

    @NotBlank(message = "Insira o cargo do colaborador")
    private String position;

    @NotNull
    private LocalDate contractDate;

    @NotNull(message = "Insira o salário do colaborador")
    private BigDecimal salary;

}
