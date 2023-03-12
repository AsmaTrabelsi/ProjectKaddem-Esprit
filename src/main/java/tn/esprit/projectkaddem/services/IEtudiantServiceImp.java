package tn.esprit.projectkaddem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projectkaddem.entites.Etudiant;
import tn.esprit.projectkaddem.repositories.EtudiantRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IEtudiantServiceImp implements  IEtudiantService{
    private final EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiantById(Integer id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void ajouteEtudiant(Etudiant e) {
    etudiantRepository.save(e);
    }

    @Override
    public void updateEtudiant(Etudiant e) {
    etudiantRepository.save(e);
    }

    @Override
    public void deleteEtudiant(Integer id) {
    etudiantRepository.deleteById(id);
    }
}
