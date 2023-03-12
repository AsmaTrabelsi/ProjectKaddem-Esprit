package tn.esprit.projectkaddem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projectkaddem.entites.Universite;
import tn.esprit.projectkaddem.repositories.UniversiteRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IUniversiteServiceImp implements IUniversiteService{
    private final UniversiteRepository universiteRepository;
    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(Integer id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void ajouteUniversite(Universite u) {
    universiteRepository.save(u);
    }

    @Override
    public void updateUniversite(Universite u) {
        universiteRepository.save(u);

    }

    @Override
    public void deleteUniversite(Integer id) {
    universiteRepository.deleteById(id);
    }
}
