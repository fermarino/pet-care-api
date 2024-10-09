package com.example.petvet.controller;

import com.example.petvet.entity.Clinic;
import com.example.petvet.services.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinics")
public class ClinicController {

    @Autowired
    private ClinicService clinicService;

    @GetMapping
    public List<Clinic> findAll() {
        return clinicService.findAll();
    }

    @PostMapping
    public Clinic save(@RequestBody Clinic clinic) {
        return clinicService.save(clinic);
    }

    @GetMapping("/{id}")
    public Clinic findById(@PathVariable Long id) {
        return clinicService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clinicService.delete(id);
    }
}
