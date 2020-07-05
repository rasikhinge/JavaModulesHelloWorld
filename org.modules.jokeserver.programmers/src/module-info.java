module org.modules.jokeserver.programmers {
    requires org.modules.jokeserver;
//    exports org.modules.jokeserver.programmers;

    provides org.modules.jokeserver.JokeServer
            with org.modules.jokeserver.programmers.ProgrammersJokeServer;
}