package com.example.petvet.service;

import com.example.petvet.entity.Appointment;
import com.example.petvet.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment findById(Long id) {
        return appointmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
    }

    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }
}
