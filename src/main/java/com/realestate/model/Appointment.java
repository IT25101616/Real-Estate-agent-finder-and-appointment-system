package com.realestate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "appointments")
public class Appointment extends ServiceRecord{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;
    private String email;
    private String property;
    private String appointmentDate;


    public Appointment() {
    }

    public Appointment(String createdBy, String clientName, String clientEmail, String property, String appointmentDate) {
        super(createdBy);
        this.clientName = clientName;
        this.email = clientEmail;
        this.property = property;
        this.appointmentDate = appointmentDate;
    }

    public String getRecordType() {

        return "Appointment Record";
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return clientName;
    }

    public String getEmail() {
        return email;
    }

    public String getProperty() {
        return property;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setCustomerName(String clientName) {

        this.clientName = clientName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}