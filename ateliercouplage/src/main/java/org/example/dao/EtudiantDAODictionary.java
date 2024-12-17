package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAODictionary implements IEtudiantDAO {
    static private Map<Integer, Etudiant> etudiantsMap = new HashMap<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return new ArrayList<>(etudiantsMap.values());
    }

    @Override
    public Etudiant updateEtudiant(Integer id, Etudiant updatedEtudiant) {
        if (etudiantsMap.containsKey(id)) {
            Etudiant e = etudiantsMap.get(id);
            e.setNom(updatedEtudiant.getNom());
            e.setPrenom(updatedEtudiant.getPrenom());
            e.setEmail(updatedEtudiant.getEmail());
            return e;
        }
        return null;
    }
}
