package com.jd.cabinetmedical.services;

import com.jd.cabinetmedical.interfaces.PatientService;
import com.jd.cabinetmedical.models.Patient;
import com.jd.cabinetmedical.repositories.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient save(Patient p) {
        this.patientRepository.save(p);
        return p;
    }

    @Override
    public Optional<Patient> findById(Integer id) {
        return this.patientRepository.findById(id);
    }

    @Override
    public Patient update(Patient p) {
        this.patientRepository.save(p);
        return p;
    }

    @Override
    public void deleteById(Integer id) {
        this.patientRepository.deleteById(id);
    }
}
