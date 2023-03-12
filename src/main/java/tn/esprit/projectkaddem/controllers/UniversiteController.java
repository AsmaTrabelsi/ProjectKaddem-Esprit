package tn.esprit.projectkaddem.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projectkaddem.entites.Universite;
import tn.esprit.projectkaddem.services.IUniversiteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("universite")
public class UniversiteController {
    private final IUniversiteService iUniversiteService;
    @GetMapping
    public List<Universite> getAll(){
        return iUniversiteService.getAllUniversite();
    }
    @GetMapping("/{id}")
    public Universite get(@PathVariable Integer id){
        return iUniversiteService.getUniversiteById(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        iUniversiteService.deleteUniversite(id);
    }
    @PutMapping
    public void update(@RequestBody Universite d){
        iUniversiteService.updateUniversite(d);
    }
    @PostMapping
    public void add(@RequestBody Universite d){
        iUniversiteService.updateUniversite(d);
    }
}
