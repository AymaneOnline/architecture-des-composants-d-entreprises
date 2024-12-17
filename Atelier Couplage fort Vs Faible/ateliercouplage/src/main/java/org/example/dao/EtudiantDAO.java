package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiantDAO{
    static List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @Override
    public Etudiant updateEtudiant(Integer id, Etudiant updatedEtudiant) {
        for (Etudiant e : etudiants) {
            if (e.getId().equals(id)) {
                e.setNom(updatedEtudiant.getNom());
                e.setPrenom(updatedEtudiant.getPrenom());
                e.setEmail(updatedEtudiant.getEmail());
                return e;
            }
        }
        return null;
    }

}
