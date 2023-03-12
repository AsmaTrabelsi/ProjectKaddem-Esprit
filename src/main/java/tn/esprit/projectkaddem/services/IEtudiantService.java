package tn.esprit.projectkaddem.services;

import tn.esprit.projectkaddem.entites.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> getAllEtudiant();
    Etudiant getEtudiantById(Integer id);
    void ajouteEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    void deleteEtudiant(Integer id);
}
