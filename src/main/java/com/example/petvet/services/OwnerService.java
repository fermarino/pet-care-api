package com.example.petvet.services;

import com.example.petvet.entity.Owner;
import com.example.petvet.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElseThrow(() -> new RuntimeException("Dono não encontrado"));
    }

    public void delete(Long id) {
        ownerRepository.deleteById(id);
    }
}
