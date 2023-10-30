package com.example.houssem_khedhri.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inscription {
    @Id
    private long numInscription;
    private int numSemaine;

    public Inscription(long numInscription, int numSemaine) {
        this.numInscription = numInscription;
        this.numSemaine = numSemaine;
    }

    public Inscription() {

    }

    public long getNumInscription() {
        return numInscription;
    }

    public void setNumInscription(long numInscription) {
        this.numInscription = numInscription;
    }

    public int getNumSemaine() {
        return numSemaine;
    }

    public void setNumSemaine(int numSemaine) {
        this.numSemaine = numSemaine;
    }
}
