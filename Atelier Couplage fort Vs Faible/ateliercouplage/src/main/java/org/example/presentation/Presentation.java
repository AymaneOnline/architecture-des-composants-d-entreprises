package org.example.presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        // Ajout 4 etudiants
        etudiantManager.addEtudiant(new Etudiant(1, "aymane1", "elboudadi1", "aymane1@exemple.com"));
        etudiantManager.addEtudiant(new Etudiant(2, "aymane2", "elboudadi2", "aymane2@exemple.com"));
        etudiantManager.addEtudiant(new Etudiant(3, "aymane3", "elboudadi3", "aymane3@exemple.com"));
        etudiantManager.addEtudiant(new Etudiant(4, "aymane4", "elboudadi4", "aymane4@exemple.com"));

        etudiantManager.addEtudiant(new Etudiant(5, "aymane5", "elboudadi5", "aymane4@exemple.com"));

        System.out.println("Liste des etudiants : ");
        etudiantManager.getAllEtudiants().forEach(System.out::println);
    }
}
