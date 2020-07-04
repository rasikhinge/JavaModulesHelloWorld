package org.modules.jokeapp;

import org.modules.jokeserver.JokesServer;

public class JokeApp {
    public static void main(String[] args) {
        System.out.println("Displaying Jokes form Joke Server .. ");
        JokesServer server = new JokesServer();
        for (int i = 0; i < 20; i++) {
            System.out.println(server.getJoke());
        }
    }
}
