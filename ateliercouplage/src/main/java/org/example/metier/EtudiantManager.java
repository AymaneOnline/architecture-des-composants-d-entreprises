package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.IEtudiantDAO;

import java.util.List;

public class EtudiantManager {
    // public EtudiantDAO etudiantDAO;
    // public EtudiantDAODictionary etudiantDAO;
    private IEtudiantDAO etudiantDAO;

    public EtudiantManager(IEtudiantDAO etudiantDAO) {
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

    public Etudiant updateEtudiant(Integer id, Etudiant updatedEtudiant) {
        return etudiantDAO.updateEtudiant(id, updatedEtudiant);
    }
}
