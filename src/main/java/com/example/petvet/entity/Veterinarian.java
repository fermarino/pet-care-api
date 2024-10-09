package com.example.petvet.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "veterinarians")
@Data
public class Veterinarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;
}
