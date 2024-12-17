package org.example.dao;

import java.util.List;

public interface IEtudiantDAO {
    Etudiant addEtudiant(Etudiant etudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant updateEtudiant(Integer id, Etudiant etudiant);
}

/**
 * On a ajouter l'interface IEtudiantDAO pour éviter de modifier EtudiantManager chaque
 * fois qu'on change la classe de DAO (par exemple, passer de EtudiantDAO à EtudiantDAODictionary).
 * Il s'agit d'appliquer le couplage faible.
 */
