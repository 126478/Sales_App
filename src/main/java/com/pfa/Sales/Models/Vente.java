package com.pfa.Sales.Models;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
@Table(name="Vente")
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venteId;
    private Date dateVente;
    private String statut;
    private double total;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "vente")
    private List<LigneDeVente> lignesDeVente;

    public Long getVenteId() {
        return venteId;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public String getStatut() {
        return statut;
    }

    public double getTotal() {
        return total;
    }

    public Client getClient() {
        return client;
    }

    public List<LigneDeVente> getLignesDeVente() {
        return lignesDeVente;
    }

    public void setVenteId(Long venteId) {
        this.venteId = venteId;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setLignesDeVente(List<LigneDeVente> lignesDeVente) {
        this.lignesDeVente = lignesDeVente;
    }
}
