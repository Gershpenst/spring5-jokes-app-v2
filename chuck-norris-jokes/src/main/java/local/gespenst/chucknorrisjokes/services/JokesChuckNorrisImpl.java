package local.gespenst.chucknorrisjokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesChuckNorrisImpl implements Jokes {

    @Override
    public String getJokes() {
        ChuckNorrisQuotes chuck_norris_joke = new ChuckNorrisQuotes();
        return chuck_norris_joke.getRandomQuote();
    }
    
}
