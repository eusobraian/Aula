package Hqs.example.HQs.Controller;


import Hqs.example.HQs.Model.Inf;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Object {

    @GetMapping("/Historia em Quadrinho")
    public Inf inf(){
        Inf hq = new Inf();
        hq.setHQ("Piada Mortal");
        hq.setType("Herois");
        hq.setPublishing_Company("DC Comics");
        return hq;
    }

    @GetMapping("/cadastro")
    public ArrayList<Inf> Inf() {

        Inf hq = new Inf();
        hq.setHQ("Piada Mortal");
        hq.setType("Quadrinhos");
        hq.setPublishing_Company("DC Comics");

        Inf hq1 = new Inf();
        hq1.setHQ("Demolidor");
        hq1.setType("Quadrinhos");
        hq1.setPublishing_Company("Marvel");

        Inf hq3 = new Inf();
        hq3.setHQ("Sweet Tooth");
        hq3.setType("Quadrinhos");
        hq3.setPublishing_Company("Vertigo");

        ArrayList<Inf> register = new ArrayList<>();
        register.add(hq);
        register.add(hq1);
        register.add(hq3);

        return register;



    }

}
