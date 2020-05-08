package com.example.Test.Controller;

import com.example.Test.Model.CampeoesEntity;
import com.example.Test.Repository.CampeoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/campeoes")

public class CampeoesController {

    @Autowired
    private CampeoesRepository campeoesRepository;



    @GetMapping
    public ResponseEntity<List<CampeoesEntity>> findAll(){
        return new ResponseEntity<List<CampeoesEntity>> (
                (List<CampeoesEntity>) this.campeoesRepository.findAll (),
                new HttpHeaders (), HttpStatus.OK);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<CampeoesEntity> findbyId(@PathVariable("id")long id){
        if (this.campeoesRepository.findById(id).isPresent()){
            return new ResponseEntity<CampeoesEntity>(
                    this.campeoesRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<CampeoesEntity>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<CampeoesEntity> cadastrar (@RequestBody CampeoesEntity campeoesEntity){
        return new ResponseEntity<CampeoesEntity>(
                this.campeoesRepository.save(campeoesEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );

    }
    @PutMapping(value = "/{id}")
    public  ResponseEntity<CampeoesEntity> atualizar (@PathVariable("id") long id, @RequestBody CampeoesEntity campeoesEntity) throws Exception{
        if (id == 0 || !this.campeoesRepository.existsById(id)){
            throw new Exception("Código não encontrado ou inexsistente!");

        }
        return new ResponseEntity<CampeoesEntity>(
                this.campeoesRepository.save(campeoesEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CampeoesEntity> deletar (@PathVariable("id") long id){
        this.campeoesRepository.deleteById(id);
        return new ResponseEntity<CampeoesEntity>(new HttpHeaders(), HttpStatus.OK);

    }

}
