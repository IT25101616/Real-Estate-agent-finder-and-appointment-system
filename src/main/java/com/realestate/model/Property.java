package com.realestate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class Property extends ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String propertyName;
    private String location;
    private double price;
    private String propertyType;
    private String description;

    public Property() {
    }

    public Property(String createdBy, String propertyName, String location,
                    double price, String propertyType, String description) {
        super(createdBy);
        this.propertyName = propertyName;
        this.location = location;
        this.price = price;
        this.propertyType = propertyType;
        this.description = description;
    }

    @Override
    public String getRecordType() {
        return "Property Record";
    }

    public Long getId() {
        return id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}