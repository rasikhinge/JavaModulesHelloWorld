package org.modules.jokeserver.programmers;

import org.modules.jokeserver.JokeServer;

import java.util.List;

public class ProgrammersJokeServer implements JokeServer {
    List<String> jokes = List.of("PJoke 1", "PJoke 2", "PJoke 3", "PJoke 4", "PJoke 5");

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
        return "Programmers JokeServer";
    }
}
