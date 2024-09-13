package org.example.JSON_DTOExcercises.dtos;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class AddressDTO {
    private String street;
    private String city;
    private int zipCode;
}
