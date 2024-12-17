package org.example.presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.dao.EtudiantDAODictionary;
import org.example.dao.IEtudiantDAO;
import org.example.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        IEtudiantDAO etudiantDAO = new EtudiantDAODictionary(); // Ou EtudiantDAO (grace a l'interface IEdutdiantDAO)
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        // Ajout 4 etudiants
        etudiantManager.addEtudiant(new Etudiant(1, "aymane1", "ay1", "aymane1@exemple.com"));
        etudiantManager.addEtudiant(new Etudiant(2, "aymane2", "ay2", "aymane2@exemple.com"));
        etudiantManager.addEtudiant(new Etudiant(3, "aymane3", "ay3", "aymane3@exemple.com"));
        etudiantManager.addEtudiant(new Etudiant(4, "aymane4", "ay4", "aymane4@exemple.com"));

        etudiantManager.addEtudiant(new Etudiant(5, "aymane5", "ay5", "aymane4@exemple.com"));

        // Mise a jour d'un etudiant
        etudiantManager.updateEtudiant(1, new Etudiant(1, "aymane1", "ay1", "newaymane1@exemple.com"));

        System.out.println("Liste des etudiants : ");
        etudiantManager.getAllEtudiants().forEach(System.out::println);
    }
}
