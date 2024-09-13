package org.example.DTOExcercises.services;

import org.example.DTOExcercises.dtos.PersonDTO;
import org.example.DTOExcercises.entities.Person;

import java.time.LocalDate;

public class PersonController {

    public PersonDTO showPerson() {
        Person person = Person.builder()
                .firstName("John")
                .lastName("Doe")
                .birthDate(LocalDate.of(1992, 9, 10))
                .socialSecurityNumber("1009926655")
                .build();
        return new PersonDTO(person.getFirstName(), person.getLastName());
    }
}
