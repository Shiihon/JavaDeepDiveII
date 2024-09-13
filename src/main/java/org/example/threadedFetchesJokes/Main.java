package org.example.threadedFetchesJokes;

import org.example.threadedFetchesJokes.dtos.AllJokesDTO;
import org.example.threadedFetchesJokes.dtos.ChuckJokeDTO;
import org.example.threadedFetchesJokes.dtos.DadJokeDTO;
import org.example.threadedFetchesJokes.services.JokeService;

public class Main {
    public static void main(String[] args) {
        //  DadJokeDTO dadJokeDTO = JokeService.getRandomDadJoke();
        //System.out.println(dadJokeDTO);
        //System.out.println("Dad Joke: " + dadJokeDTO.getJoke());

        DadJokeDTO dadJokeDTo = JokeService.getJokeFromApi(DadJokeDTO.class, "https://icanhazdadjoke.com/");
        ChuckJokeDTO chuckJokeDTO = JokeService.getJokeFromApi(ChuckJokeDTO.class, "https://api.chucknorris.io/jokes/random");

//        System.out.println(dadJokeDTo.getJoke());
//        System.out.println(chuckJokeDTO.getJoke());

        AllJokesDTO allJokesDTO = new AllJokesDTO();
        allJokesDTO.setChuckJokeDTO(chuckJokeDTO);
        allJokesDTO.setDadJokeDTO(dadJokeDTo);
        System.out.println(allJokesDTO.getAllJokes());

    }
}
