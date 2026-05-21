package com.realestate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment extends ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;
    private String clientEmail;
    private String phoneNumber;
    private String appointmentDate;
    private String message;


    public Appointment() {
    }

    public Appointment(String createdBy, String clientName, String clientEmail, String phoneNumber, String appointmentDate,String message) {
        super(createdBy);
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = appointmentDate;
        this.message = message;
    }

    @Override
    public String getRecordType() {
        return "Appointment Record";
    }

    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getMessage() {
        return message;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}