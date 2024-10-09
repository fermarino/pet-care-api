package com.example.petvet.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "pets")
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type; // Ex: cão, gato, etc.

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
