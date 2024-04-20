package com.pfa.Sales.Models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Utilisateur")

public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long utilisateurId;
    private String nom;
    private String email;
    private String motDePasse;
    private String role;

    public Utilisateur(Long utilisateurId, String nom, String email, String motDePasse, String role) {
        this.utilisateurId = utilisateurId;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public Utilisateur() {

    }

    public enum Role {
        ADMINISTRATEUR,
        UTILISATEUR
    }

    public static Utilisateur creerAdmin(String nom, String email, String motDePasse) {
        Utilisateur admin = new Utilisateur();
        admin.setNom(nom);
        admin.setEmail(email);
        admin.setMotDePasse(motDePasse);
        admin.setRole(String.valueOf(Role.ADMINISTRATEUR));
        return admin;
    }

    public Long getUtilisateurId() {
        return utilisateurId;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setUtilisateurId(Long utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
