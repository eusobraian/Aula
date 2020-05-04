package Movie.example.Movie.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getMenssage() {
        return "Bem vindo a rede!";
    }

}