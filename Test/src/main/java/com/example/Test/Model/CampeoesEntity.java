package com.example.Test.Model;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

@Entity
@Table(name="campeoes")

public class CampeoesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_campeoes")
    private  long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "skills")
    private String skills;

    @Column(name = "damage")
    private String damage;


}
