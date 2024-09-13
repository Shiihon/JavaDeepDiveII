package org.example.threadedFetchesJokes.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DadJokeDTO implements IJoke {
    private String id;
    private String joke;

    @Override
    public String getJoke(){
        return "Dad joke : " + joke;
    }
}
