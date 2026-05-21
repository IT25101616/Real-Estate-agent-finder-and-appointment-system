package com.realestate.service;

import com.realestate.model.Appointment;
import com.realestate.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService implements ManagementService<Appointment> {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment create(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getById(Long id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    @Override
    public Appointment update(Long id, Appointment newAppointment) {
        Appointment oldAppointment = appointmentRepository.findById(id).orElse(null);

        if (oldAppointment != null) {
            oldAppointment.setClientName(newAppointment.getClientName());
            oldAppointment.setClientEmail(newAppointment.getClientEmail());
            oldAppointment.setPhoneNumber(newAppointment.getPhoneNumber());
            oldAppointment.setAppointmentDate(newAppointment.getAppointmentDate());
            oldAppointment.setMessage(newAppointment.getMessage());
            oldAppointment.setCreatedBy(newAppointment.getCreatedBy());

            return appointmentRepository.save(oldAppointment);
        }

        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (appointmentRepository.existsById(id)) {
            appointmentRepository.deleteById(id);
            return true;
        }

        return false;
    }
}