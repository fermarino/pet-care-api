package com.example.petvet.controller;

import com.example.petvet.entity.Veterinarian;
import com.example.petvet.services.VeterinarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarians")
public class VeterinarianController {

    @Autowired
    private VeterinarianService veterinarianService;

    @GetMapping
    public List<Veterinarian> findAll() {
        return veterinarianService.findAll();
    }
    @PostMapping
    public Veterinarian save(@RequestBody Veterinarian veterinarian) {
        System.out.println(veterinarian.getSpecialty()); // Verifique o valor recebido
        return veterinarianService.save(veterinarian);
    }


    @GetMapping("/{id}")
    public Veterinarian findById(@PathVariable Long id) {
        return veterinarianService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        veterinarianService.delete(id);
    }

    @PutMapping("/{id}")
    public Veterinarian update(@PathVariable Long id, @RequestBody Veterinarian veterinarian) {
        veterinarian.setId(id);
        return veterinarianService.save(veterinarian); // Presumindo que o save trata tanto a criação quanto a atualização
    }
}
