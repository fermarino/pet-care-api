package com.example.petvet.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "cares")
@Data
public class Care {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String careName;
    private Double price;
}
