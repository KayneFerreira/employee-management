package com.empman.employeemanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco_funcionario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeAddress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotBlank(message = "O campo 'endereço' deve ser preenchido")
    String street;

    @NotBlank(message = "O campo 'cidade' deve ser preenchido")
    String city;

    @NotBlank(message = "O campo 'estado' deve ser preenchido")
    String state;

    @NotBlank(message = "O campo 'país' deve ser preenchido")
    String country;

    @NotBlank(message = "O campo 'CEP' deve ser preenchido")
    String zipCode;

}
