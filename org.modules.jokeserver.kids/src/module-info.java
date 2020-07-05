module org.modules.jokeserver.kids {
    requires org.modules.jokeserver;
    exports org.modules.jokeserver.kids;

    provides org.modules.jokeserver.JokeServer
            with org.modules.jokeserver.kids.KidsJokeServer;
}