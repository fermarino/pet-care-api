package com.example.petvet.entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "clinics")
@Data
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
}
