package com.realestate.repository;

import com.realestate.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository
        extends JpaRepository<Appointment, Integer> {
}