package tn.esprit.projectkaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projectkaddem.entites.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
