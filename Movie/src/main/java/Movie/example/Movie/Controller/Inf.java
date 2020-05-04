package Movie.example.Movie.Controller;


import Movie.example.Movie.Model.Itens;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Inf {

    @GetMapping("/filmes")
    public ArrayList<Itens> movies(){
        Itens movie = new Itens();
        movie.setName("Coringa");
        movie.setType("Drama");
        movie.setClassification("+16");
        movie.setAwards("Oscar de melhor ator");

        return itens();
    }

    @GetMapping("cadastro")
    public ArrayList<Itens> itens(){

        Itens movies = new Itens();
        movies.setName("Coringa");
        movies.setType("Drama");
        movies.setClassification("+16");
        movies.setAwards("Oscar de melhor ator");

        Itens movies1 = new Itens();
        movies1.setName("1917");
        movies1.setType("Drama");
        movies1.setClassification("+14");
        movies1.setAwards("Oscar de melhor filmagem");

        Itens movies2 = new Itens();
        movies2.setName("Parasita");
        movies2.setType("Thriller");
        movies2.setClassification("+16");
        movies2.setAwards("Oscar de melhor filme");

        ArrayList<Itens> register = new ArrayList();
        register.add(movies);
        register.add(movies1);
        register.add(movies2);

        return register;



    }

}
