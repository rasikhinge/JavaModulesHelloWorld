package org.module.jokeserver.kids;

import org.modules.jokeserver.JokeServer;

import java.util.List;

public class KidsJokeServer implements JokeServer {
    private List<String> jokes = List.of("Joke 1", "Joke 2", "Joke 3", "Joke 4", "Joke 5", "Joke 6");


    @Override
    public int availableJokes() {
        return jokes.size();
    }

    @Override
    public String getJoke() {
        int randomNumber = (int) Math.random() * jokes.size();
        return jokes.get(randomNumber);
    }

    @Override
    public String getName() {
        return "Kids Joke Server";
    }
}
