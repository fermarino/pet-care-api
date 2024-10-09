package com.example.petvet.controller;

import com.example.petvet.entity.Care;
import com.example.petvet.services.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cares")
public class CareController {

    @Autowired
    private CareService careService;

    @GetMapping
    public List<Care> findAll() {
        return careService.findAll();
    }

    @PostMapping
    public Care save(@RequestBody Care care) {
        return careService.save(care);
    }

    @GetMapping("/{id}")
    public Care findById(@PathVariable Long id) {
        return careService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        careService.delete(id);
    }
}
