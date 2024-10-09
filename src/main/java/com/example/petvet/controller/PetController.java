package com.example.petvet.controller;

import com.example.petvet.entity.Pet;
import com.example.petvet.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> findAll() {
        return petService.findAll();
    }

    @PostMapping
    public Pet save(@RequestBody Pet pet) {
        return petService.save(pet);
    }

    @GetMapping("/{id}")
    public Pet findById(@PathVariable Long id) {
        return petService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        petService.delete(id);
    }
}
