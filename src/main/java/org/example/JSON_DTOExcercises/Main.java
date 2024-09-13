package org.example.JSON_DTOExcercises;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.JSON_DTOExcercises.dtos.AccountDTO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/account.json";
        List<AccountDTO> accountList = accountsFromJson(filePath);
        if (accountList != null) {
            accountList.forEach(System.out::println);
        }
    }

    public static List<AccountDTO> accountsFromJson (String jsonFilePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode dataNode = objectMapper.readTree(new File(jsonFilePath));

            List<AccountDTO> listOfAccounts = new ArrayList<>();
            for (JsonNode accountNode : dataNode) {
                if (accountNode.has("id")) {
                    AccountDTO accountDTO = objectMapper.treeToValue(accountNode, AccountDTO.class);
                    listOfAccounts.add(accountDTO);
                }
            } return listOfAccounts;

        } catch (IOException e) {
            System.err.println("Failed to read the file");
            e.printStackTrace();
        }
        return null;
    }
}
