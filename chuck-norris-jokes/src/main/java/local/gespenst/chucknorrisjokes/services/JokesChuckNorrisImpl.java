package local.gespenst.chucknorrisjokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Création de la classe "JokesChuckNorrisImpl" à partir de l'interface "Jokes" afin de créer des blagues lors de l'appel de la méthode
 * "getJokes"
 */
@Service
public class JokesChuckNorrisImpl implements Jokes {
    
    private final ChuckNorrisQuotes chuck_norris_joke;

    public JokesChuckNorrisImpl() {
        this.chuck_norris_joke = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuck_norris_joke.getRandomQuote();
    }
    
}
