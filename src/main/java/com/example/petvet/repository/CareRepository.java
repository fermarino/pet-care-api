package com.example.petvet.repository;

import com.example.petvet.entity.Care;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareRepository extends JpaRepository<Care, Long> {
}
