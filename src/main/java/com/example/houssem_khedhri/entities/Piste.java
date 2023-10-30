package com.example.houssem_khedhri.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Piste {
    @Id
    private long numPiste;
    private String nomPiste;
    private Couleur Couleur ;
    private int longueur;
    private int pente;

    public Piste() {
    }

    public Piste(long numPiste, String nomPiste, Couleur couleur, int longueur, int pente) {
        this.numPiste = numPiste;
        this.nomPiste = nomPiste;
        this.Couleur = couleur;
        this.longueur = longueur;
        this.pente = pente;
    }

    public long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(long numPiste) {
        this.numPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Couleur getCouleur() {
        return Couleur;
    }

    public void setCouleur(Couleur Couleur) {
        this.Couleur = Couleur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }
}
