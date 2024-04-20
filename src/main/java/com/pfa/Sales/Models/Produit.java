package com.pfa.Sales.Models;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Produit")

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produitId;
    private String nom;
    private String description;
    private double prix;
    private int quantiteEnStock;
    private String image;

    public Long getProduitId() {
        return produitId;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public String getImage() {
        return image;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
