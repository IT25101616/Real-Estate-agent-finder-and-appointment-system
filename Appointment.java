package com.realestate.model;

import jakarta.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String customerName;
    private String email;
    private String property;
    private String appointmentDate;

    public Appointment() {
    }

    public Appointment(String customerName, String email,
                       String property, String appointmentDate) {
        this.customerName = customerName;
        this.email = email;
        this.property = property;
        this.appointmentDate = appointmentDate;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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