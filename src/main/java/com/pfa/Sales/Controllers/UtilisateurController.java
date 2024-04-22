package com.pfa.Sales.Controllers;
import com.pfa.Sales.Models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pfa.Sales.Repositories.UtilisateurRepository;
@RestController
@RequestMapping("/utilisateurs")//llb
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private UtilisateurRepository utilisateurRepository;


//int
    @PutMapping("/{id}")
    public Utilisateur mettreAJourUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateurDetails) {
        Utilisateur utilisateur = utilisateurService.recupererUtilisateurParId(id)
                .orElseThrow(() -> new UtilisateurNotFoundException("Utilisateur non trouvé avec l'ID: " + id));
        utilisateur.setNom(utilisateurDetails.getNom());
        utilisateur.setEmail(utilisateurDetails.getEmail());
        utilisateur.setMotDePasse(utilisateurDetails.getMotDePasse());
        return utilisateurRepository.save(utilisateur); //  kkkk  Utilisation du repository pour sauvegarder l'utilisateur mis à jour
    }
}
