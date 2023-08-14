package guru.springframework.ChuckNorrisJokeApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class CheckNorrisJokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes quotes;

    public CheckNorrisJokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }

}
