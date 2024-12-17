package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {
    static List<Etudiant> etudiants = new ArrayList<>();

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

}
