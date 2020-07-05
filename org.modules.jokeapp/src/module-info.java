module org.modules.jokeapp {
    requires org.modules.jokeserver;
//    requires org.modules.jokeserver.kids;
//    requires org.modules.jokeserver.programmers;

    uses org.modules.jokeserver.JokeServer;
}