package com.realestate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment extends ServiceRecord{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;
    private String clientEmail;
    private String phoneNumber;
    private String appointmentDate;


    public Appointment() {
    }

    public Appointment(String createdBy, String clientName, String clientEmail, String phoneNumber, String appointmentDate) {
        super(createdBy);
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = appointmentDate;
    }

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
}