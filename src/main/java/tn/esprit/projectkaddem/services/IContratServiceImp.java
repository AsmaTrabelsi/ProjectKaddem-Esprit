package tn.esprit.projectkaddem.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projectkaddem.entites.Contrat;
import tn.esprit.projectkaddem.repositories.ContratRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class IContratServiceImp implements IContratService{
    private  final ContratRepository contratRepository;

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getContratById(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void ajouteContrat(Contrat contrat) {
      contratRepository.save(contrat);
    }

    @Override
    public void updateContrat(Contrat contrat) {
        contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Integer id) {
    contratRepository.deleteById(id);
    }
}
