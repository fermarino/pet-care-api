package com.example.petvet.services;

import com.example.petvet.entity.Pet;
import com.example.petvet.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet findById(Long id) {
        return petRepository.findById(id).orElseThrow(() -> new RuntimeException("Pet não encontrado"));
    }

    public void delete(Long id) {
        petRepository.deleteById(id);
    }
}
