package com.realestate.model;

import jakarta.persistence.MappedSuperclass;

// Parent class for Appointment, Billing, and Property
@MappedSuperclass
public abstract class ServiceRecord {

    private String createdBy;

    public ServiceRecord() {
    }

    public ServiceRecord(String createdBy) {
        this.createdBy = createdBy;
    }

    // Polymorphism method
    public abstract String getRecordType();

    // Encapsulation
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}