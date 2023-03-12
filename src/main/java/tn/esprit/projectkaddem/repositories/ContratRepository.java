package tn.esprit.projectkaddem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projectkaddem.entites.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
}
