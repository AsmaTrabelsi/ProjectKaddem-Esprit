package tn.esprit.projectkaddem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectkaddem.entites.Etudiant;
import tn.esprit.projectkaddem.services.IEtudiantService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("etudiant")
public class EtudiantController {
    private final IEtudiantService iEtudiantService;
    @GetMapping
    public List<Etudiant> getAll(){
        return iEtudiantService.getAllEtudiant();
    }

    @GetMapping("/{id}")
    public Etudiant get(@PathVariable  Integer id){
        return iEtudiantService.getEtudiantById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        iEtudiantService.deleteEtudiant(id);
    }

    @PutMapping
    public void update(@RequestBody Etudiant e){
        iEtudiantService.updateEtudiant(e);
    }
    @PostMapping
    public void add(@RequestBody Etudiant e){
        iEtudiantService.ajouteEtudiant(e);
    }
}
