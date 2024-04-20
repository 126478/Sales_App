package com.pfa.Sales.Models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="LigneDeVente")

public class LigneDeVente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ligneDeVenteId;

    @ManyToOne
    private Vente vente;

    @ManyToOne
    private Produit produit;
    private int quantite;
    private double prixUnitaire;

    public LigneDeVente(Long ligneDeVenteId, Vente vente, Produit produit, int quantite, double prixUnitaire) {
        this.ligneDeVenteId = ligneDeVenteId;
        this.vente = vente;
        this.produit = produit;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    public Long getLigneDeVenteId() {
        return ligneDeVenteId;
    }

    public Vente getVente() {
        return vente;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setLigneDeVenteId(Long ligneDeVenteId) {
        this.ligneDeVenteId = ligneDeVenteId;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
