package org.example.DTOExcercises.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private String fullName;
    private String email;
}
