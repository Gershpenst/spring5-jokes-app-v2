package local.gespenst.chucknorrisjokes.controllers;

import org.springframework.stereotype.Controller;

import local.gespenst.chucknorrisjokes.services.Jokes;

@Controller
public class JokesChuckNorrisController {
    
    private final Jokes jokes;

    public JokesChuckNorrisController(Jokes jokes) {
        this.jokes = jokes;
    }

    public String makeMeLaugh() {
        return this.jokes.getJokes();
    }

}
