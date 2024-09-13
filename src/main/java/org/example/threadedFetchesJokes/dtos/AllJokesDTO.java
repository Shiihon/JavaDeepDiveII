package org.example.threadedFetchesJokes.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllJokesDTO {
    private DadJokeDTO dadJokeDTO;
    private ChuckJokeDTO chuckJokeDTO;

    public String getAllJokes() {
        StringBuilder jokes = new StringBuilder();
        jokes.append(dadJokeDTO.getJoke() + "\n");
        jokes.append(chuckJokeDTO.getJoke());
        return jokes.toString();
    }
}
