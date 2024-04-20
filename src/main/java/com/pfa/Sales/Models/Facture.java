package com.pfa.Sales.Models;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name="Facture")

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long factureId;
    private Date dateFacturation;
    private double montantTotal;
    private String statutPaiement;
    private String pdf;

    @OneToOne
    private Vente vente;

    public Facture(Long factureId, Date dateFacturation, double montantTotal, String statutPaiement, String pdf, Vente vente) {
        this.factureId = factureId;
        this.dateFacturation = dateFacturation;
        this.montantTotal = montantTotal;
        this.statutPaiement = statutPaiement;
        this.pdf = pdf;
        this.vente = vente;
    }

    public Long getFactureId() {
        return factureId;
    }

    public Date getDateFacturation() {
        return dateFacturation;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public String getStatutPaiement() {
        return statutPaiement;
    }

    public String getPdf() {
        return pdf;
    }

    public Vente getVente() {
        return vente;
    }

    public void setFactureId(Long factureId) {
        this.factureId = factureId;
    }

    public void setDateFacturation(Date dateFacturation) {
        this.dateFacturation = dateFacturation;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public void setStatutPaiement(String statutPaiement) {
        this.statutPaiement = statutPaiement;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }
}
