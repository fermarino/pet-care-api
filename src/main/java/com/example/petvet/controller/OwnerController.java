package com.example.petvet.controller;

import com.example.petvet.entity.Owner;
import com.example.petvet.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping
    public List<Owner> findAll() {
        return ownerService.findAll();
    }

    @PostMapping
    public Owner save(@RequestBody Owner owner) {
        return ownerService.save(owner);
    }

    @GetMapping("/{id}")
    public Owner findById(@PathVariable Long id) {
        return ownerService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ownerService.delete(id);
    }
}
