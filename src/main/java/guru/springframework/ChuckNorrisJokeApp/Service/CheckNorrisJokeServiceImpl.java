package guru.springframework.ChuckNorrisJokeApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class CheckNorrisJokeServiceImpl implements JokeService {

    private ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public CheckNorrisJokeServiceImpl() {
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }

}
