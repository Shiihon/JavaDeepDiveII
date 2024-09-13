package org.example.JSON_DTOExcercises.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ClientDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private AddressDTO addressDTO;
    private AccountDTO accountDTO;

}

