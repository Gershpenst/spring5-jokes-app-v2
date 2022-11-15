package local.gespenst.chucknorrisjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import local.gespenst.chucknorrisjokes.services.Jokes;

/**
 * Envoie les données les blagues vers le front (en utilisant Thymeleaf) en utilisant la variable "joke".
 */
@Controller
public class JokesChuckNorrisController {
    
    private final Jokes jokes;

    public JokesChuckNorrisController(Jokes jokes) {
        this.jokes = jokes;
    }

    @RequestMapping(value = {"/", ""})
    public String makeMeLaugh(Model model) {
        model.addAttribute("joke", this.jokes.getJokes());
        return "index";
    }

}
