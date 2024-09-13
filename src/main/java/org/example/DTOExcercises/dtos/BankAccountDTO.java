package org.example.DTOExcercises.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class BankAccountDTO {
    private String accountNumber;
    private double balance;
    private LocalDate createdAt;
}



