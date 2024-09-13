package org.example.JSON_DTOExcercises.dtos;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
public class AccountDTO {
    private int id;
    private double balance;
    @JsonSetter("isActive") //spørg why?
    private boolean isActive;

    @Override
    public String toString() {
        return "AccountDTO {" +
                "ID: " + id +
                ", Balance: $" + String.format("%.2f", balance) +
                ", Active: " + (isActive ? "Yes" : "No") +
                '}';
    }
}