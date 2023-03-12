package tn.esprit.projectkaddem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectkaddem.entites.Contrat;
import tn.esprit.projectkaddem.services.IContratService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("contrat")
public class ContratController {
    private final IContratService iContratService;

    @GetMapping
    public List<Contrat> getAll(){
        return iContratService.getAllContrats();
    }

    @GetMapping("/{id}")
    public Contrat get(@PathVariable Integer id){
        return iContratService.getContratById(id);
    }

    @PostMapping()
    public void add(@RequestBody Contrat c){
        iContratService.ajouteContrat(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        iContratService.deleteContrat(id);
    }

    @PutMapping()
    public void update(@RequestBody Contrat c){
        iContratService.updateContrat(c);
    }

}
