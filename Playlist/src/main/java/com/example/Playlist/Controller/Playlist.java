package com.example.Playlist.Controller;

import com.example.Playlist.Model.Inf;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Playlist {
    @GetMapping("Músicas")
    public Inf playlist(){
       Inf play = new Inf();
        play.setMusic1("Don Toliver - No Photos");
        play.setMusic2("Travis Scott - Can't Say");
        play.setMusic3("Drake - Nonstop");
        play.setMusic4("Eminem - Godzilla");

        return play;
    }
    @GetMapping("Cadastro")
    public  ArrayList<Inf> inf(){
        Inf play1 = new Inf();
        play1.setMusic1("Beethoven's Silence");
        play1.setMusic2("Nocturnes, Op. 9: No. 1 in B-Flat Minor");
        play1.setMusic3("Married Life");
        play1.setMusic4("Einaudi - Experience ");

        Inf play2 = new Inf();
        play2.setMusic1("Labrinth – Forever ");
        play2.setMusic2("Labrinth – Demanding Excellence");
        play2.setMusic3("Labrinth – Nate Growing Up ");
        play2.setMusic4("A$AP Ferg - New Level ");

        Inf play3 = new Inf();
        play3.setMusic1("JACKBOYS, Travis Scott - WHAT TO DO? ");
        play3.setMusic2("Usher x Zaytoven - Peace Sign");
        play3.setMusic3("H.E.R. - Slide");
        play3.setMusic4("Joji - Run");

        ArrayList<Inf> register = new ArrayList<>();
        register.add(play1);
        register.add(play2);
        register.add(play3);

        return register;



    }


}
