package com.example.petvet.services;

import com.example.petvet.entity.Care;
import com.example.petvet.repository.CareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareService {

    @Autowired
    private CareRepository careRepository;

    public List<Care> findAll() {
        return careRepository.findAll();
    }

    public Care save(Care care) {
        return careRepository.save(care);
    }

    public Care findById(Long id) {
        return careRepository.findById(id).orElseThrow(() -> new RuntimeException("Cuidado não encontrado"));
    }

    public void delete(Long id) {
        careRepository.deleteById(id);
    }
}
