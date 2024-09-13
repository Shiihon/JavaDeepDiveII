package org.example.DTOExcercises;

import jakarta.persistence.EntityManagerFactory;
import org.example.DTOExcercises.dtos.BankAccountDTO;
import org.example.DTOExcercises.dtos.BankAccountWithUserDTO;
import org.example.DTOExcercises.dtos.UserDTO;
import org.example.DTOExcercises.entities.BankAccount;
import org.example.DTOExcercises.entities.User;
import org.example.config.HibernateConfig;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory("persons");

        User user = User.builder()
                .firstName("John ")
                .lastName("Doe")
                .email("JohnDoe1981@gmail.com")
                .build();

        UserDTO userDTO = new UserDTO(user.getFirstName().concat(user.getLastName()), user.getEmail());
      //  UserDTO userDTO1 = new UserDTO(String.format("%s %s", user.getFirstName(), user.getLastName()); EXAMPLE
        System.out.println(userDTO.getFullName());

        BankAccount bankAccount = BankAccount.builder()
                .userId(60)
                .accountNumber("2536 2556 2365 9999")
                .balance(20300.8)
                .createdAt(LocalDate.of(2024, 6, 10))
                .updatedAt(LocalDate.now())
                .build();

        BankAccountDTO bankAccountDTO = new BankAccountDTO(bankAccount.getAccountNumber(), bankAccount.getBalance(), bankAccount.getCreatedAt());

        BankAccountWithUserDTO bankAccountWithUserDTO = new BankAccountWithUserDTO(bankAccount.getAccountNumber(), bankAccountDTO.getBalance(), user.getFirstName().concat(user.getLastName()), user.getEmail());
        System.out.printf("Account : %s, User : %s %n", bankAccountWithUserDTO.getAccountNumber(), bankAccountWithUserDTO.getFullName());
    }
}
