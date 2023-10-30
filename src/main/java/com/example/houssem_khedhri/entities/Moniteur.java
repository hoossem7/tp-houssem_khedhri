package com.example.houssem_khedhri.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Moniteur {
    @Id
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    public Moniteur() {
    }

    public Moniteur(long numMoniteur, String nomM, String prenomM, LocalDate dateRecru) {
        this.numMoniteur = numMoniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateRecru = dateRecru;
    }

    public long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public LocalDate getDateRecru() {
        return dateRecru;
    }

    public void setDateRecru(LocalDate dateRecru) {
        this.dateRecru = dateRecru;
    }
}
