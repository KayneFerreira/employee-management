package com.empman.employeemanagement.configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.empman.employeemanagement.controllers.EmployeeController;
import com.empman.employeemanagement.entities.EmployeeAddress;
import com.empman.employeemanagement.entities.EmployeeEntity;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private EmployeeController empCtrl;

    @Override
    public void run(String... args) throws Exception {
        
        EmployeeEntity emp1 = EmployeeEntity.builder()
            .name("Roberto Rongo")
            .cpf("11111111111")
            .email("roberto.rongo@email.com")
            .phoneNumber("5511911111111")
            .address(EmployeeAddress.builder()
                .street("Rua da Pedraria Doida, 22")
                .zipCode("01111112")
                .city("Cidade da Preda")
                .state("Estado Pedreirada")
                .country("País da Pedra")
                .build())
            .department("Construtura")
            .position("Engenheiro Civil")
            .contractDate(LocalDate.now(ZoneId.of("America/Sao_Paulo")))
            .salary(new BigDecimal(15000))
            .build();
        empCtrl.insertNewEmployee(emp1);

    }
}
