package com.empman.employeemanagement.services.exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(Long id) {
        super("Não encontrado na base de dados, ID: " + id);
    }
}
