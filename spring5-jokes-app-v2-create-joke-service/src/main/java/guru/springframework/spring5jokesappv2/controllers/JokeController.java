package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService; //viene inetatto il servizio Joke

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){ //passaggio del modello
        model.addAttribute("joke",jokeService.getJoke()); //aspettiamo di ricevere un Joke dal servizio
        return "index"; //ritoriano che ci riporta al thymeleaf HTML
    }
}
