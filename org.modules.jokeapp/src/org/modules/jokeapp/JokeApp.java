package org.modules.jokeapp;

import org.module.jokeserver.kids.KidsJokeServer;
import org.modules.jokeserver.JokeServer;
import org.modules.jokeserver.programmers.ProgrammersJokeServer;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class JokeApp {
    public static void main(String[] args) {
        LinkedHashMap<String, JokeServer> servers = new LinkedHashMap<>();
        servers.put("1", new KidsJokeServer());
        servers.put("2", new ProgrammersJokeServer());

        Scanner scanner = new Scanner(System.in);
        String input = null;
        do {
            servers.forEach((k, v) -> System.out.printf("%s. %s\n", k, v.getName()));

            System.out.println("Enter Q to quit..");
            input = scanner.nextLine().trim().toUpperCase();
            if (servers.containsKey(input)) {
                System.out.println(servers.get(input).getJoke() + "\n");
            } else if (!"Q".equals(input)) {
                System.out.println("Please try again..");
            }
        } while (!input.equals("Q"));
    }
}
