package com.example.petvet.services;

import com.example.petvet.entity.Veterinarian;
import com.example.petvet.repository.VeterinarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarianService {

    @Autowired
    private VeterinarianRepository veterinarianRepository;

    public List<Veterinarian> findAll() {
        return veterinarianRepository.findAll();
    }

    public Veterinarian save(Veterinarian veterinarian) {
        return veterinarianRepository.save(veterinarian);
    }

    public Veterinarian findById(Long id) {
        return veterinarianRepository.findById(id).orElseThrow(() -> new RuntimeException("Veterinário não encontrado"));
    }

    public void delete(Long id) {
        veterinarianRepository.deleteById(id);
    }
}
