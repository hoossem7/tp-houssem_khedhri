package com.example.houssem_khedhri.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cours {
    @Id
    private long numCours;
    private int niveau;
    private Typecours typecours;
    private Support support;
    private float prix;
    private int crenau;

    public Cours() {
    }

    public Cours(long numCours, int niveau, Typecours typecours, Support support, float prix, int crenau) {
        this.numCours = numCours;
        this.niveau = niveau;
        this.typecours = typecours;
        this.support = support;
        this.prix = prix;
        this.crenau = crenau;
    }

    public long getNumCours() {
        return numCours;
    }

    public void setNumCours(long numCours) {
        this.numCours = numCours;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Typecours getTypecours() {
        return typecours;
    }

    public void setTypecours(Typecours typecours) {
        this.typecours = typecours;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getCrenau() {
        return crenau;
    }

    public void setCrenau(int crenau) {
        this.crenau = crenau;
    }
}
