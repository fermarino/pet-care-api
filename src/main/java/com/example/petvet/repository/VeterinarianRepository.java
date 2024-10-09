package com.example.petvet.repository;

import com.example.petvet.entity.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VeterinarianRepository extends JpaRepository<Veterinarian, Long> {
    List<Veterinarian> findBySpecialty(String specialty);
}
