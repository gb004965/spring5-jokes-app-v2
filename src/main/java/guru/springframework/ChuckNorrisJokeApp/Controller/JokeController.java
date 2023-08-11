package guru.springframework.ChuckNorrisJokeApp.Controller;

import guru.springframework.ChuckNorrisJokeApp.Service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke() {
        return "";
    }
}
