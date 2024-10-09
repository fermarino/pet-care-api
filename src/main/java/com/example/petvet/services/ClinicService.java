package com.example.petvet.services;

import com.example.petvet.entity.Clinic;
import com.example.petvet.repository.ClinicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService {

    @Autowired
    private ClinicRepository clinicRepository;

    public List<Clinic> findAll() {
        return clinicRepository.findAll();
    }

    public Clinic save(Clinic clinic) {
        return clinicRepository.save(clinic);
    }

    public Clinic findById(Long id) {
        return clinicRepository.findById(id).orElseThrow(() -> new RuntimeException("Clínica não encontrada"));
    }

    public void delete(Long id) {
        clinicRepository.deleteById(id);
    }
}
