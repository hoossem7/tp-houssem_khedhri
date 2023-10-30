package com.example.houssem_khedhri.Services;

import com.example.houssem_khedhri.entities.Piste;
import com.example.houssem_khedhri.repositories.PisteRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PisteService implements IPisteService{
    PisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return null;
    }

    @Override
    public List<Piste> retrieveAllPists() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pisteRepository.save(p);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).get();
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}

