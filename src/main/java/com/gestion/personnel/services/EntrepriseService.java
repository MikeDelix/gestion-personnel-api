package com.gestion.personnel.services;

import com.gestion.personnel.models.Entreprise;
import com.gestion.personnel.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    // Créer une nouvelle entreprise
    public Entreprise creerEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    // Lister toutes les entreprises
    public List<Entreprise> listerEntreprises() {
        return entrepriseRepository.findAll();
    }

    // Obtenir une entreprise par ID
    public Optional<Entreprise> obtenirEntrepriseParId(Integer id) {
        return entrepriseRepository.findById(id);
    }

    // Modifier une entreprise
    public Entreprise modifierEntreprise(Integer id, Entreprise entrepriseDetails) {
        Entreprise entreprise = entrepriseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entreprise non trouvée"));
        entreprise.setNomEntreprise(entrepriseDetails.getNomEntreprise());
        entreprise.setAdresseEntreprise(entrepriseDetails.getAdresseEntreprise());
        entreprise.setEmailEntreprise(entrepriseDetails.getEmailEntreprise());
        return entrepriseRepository.save(entreprise);
    }

    // Supprimer une entreprise
    public void supprimerEntreprise(Integer id) {
        entrepriseRepository.deleteById(id);
    }
}

