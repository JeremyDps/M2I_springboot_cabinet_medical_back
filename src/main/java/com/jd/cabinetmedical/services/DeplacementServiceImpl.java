package com.jd.cabinetmedical.services;

import com.jd.cabinetmedical.interfaces.DeplacementService;
import com.jd.cabinetmedical.models.Deplacement;
import com.jd.cabinetmedical.repositories.DeplacementRepository;

import java.util.List;
import java.util.Optional;

public class DeplacementServiceImpl implements DeplacementService {

    private DeplacementRepository deplacementRepository;

    public DeplacementServiceImpl(DeplacementRepository deplacementRepository) {
        this.deplacementRepository = deplacementRepository;
    }

    @Override
    public List<Deplacement> findAll() {
        return this.deplacementRepository.findAll();
    }

    @Override
    public Deplacement save(Deplacement d) {
        this.deplacementRepository.save(d);
        return d;
    }

    @Override
    public Optional<Deplacement> findById(Integer id) {
        return this.deplacementRepository.findById(id);
    }

    @Override
    public Deplacement update(Deplacement d) {
        this.deplacementRepository.save(d);
        return d;
    }

    @Override
    public void deleteById(Integer id) {
        this.deplacementRepository.deleteById(id);
    }
}
