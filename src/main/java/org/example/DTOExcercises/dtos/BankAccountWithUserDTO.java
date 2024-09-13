package org.example.DTOExcercises.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccountWithUserDTO {
    private String accountNumber;
    private double balance;
    private String fullName;
    private String email;
}
