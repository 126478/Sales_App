package com.pfa.Sales.Models;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Client")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String nom;
    private String adresse;
    private String email;
    private String telephone;

    public Long getClientId() {
        return clientId;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
