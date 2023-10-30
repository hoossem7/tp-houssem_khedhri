package com.example.houssem_khedhri.Services;

import com.example.houssem_khedhri.entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();

    List<Piste> retrieveAllPists();

    Piste addPiste(Piste p);

    Piste updatePiste(Piste p);

    Piste retrievePiste(Long idPiste);

    void removePiste(Long idPiste);
}

