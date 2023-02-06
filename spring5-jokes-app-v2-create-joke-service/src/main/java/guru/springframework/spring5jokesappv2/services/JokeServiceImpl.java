package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService { //

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();  //crea istanza delle citazioni
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote(); //richiama le citazione
    }
}
