package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;

import java.util.List;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;

    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant e : etudiantDAO.getAllEtudiants()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                System.out.println("Email deja utilise : " + etudiant.getEmail());
                return null;
            }
        }

        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}
