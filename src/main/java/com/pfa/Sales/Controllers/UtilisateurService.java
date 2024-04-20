package com.pfa.Sales.Controllers;
import com.pfa.Sales.Models.Utilisateur;
import com.pfa.Sales.Repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> recupererTousUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> recupererUtilisateurParId(Long id) {
        return utilisateurRepository.findById(id);
    }

    public Utilisateur mettreAJourUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public void supprimerUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }
}
