package com.realestate.model;

import jakarta.persistence.Entity;

@Entity
public class Agent extends User {

    private String phone;
    private String area;
    private int experienceYears;

    public Agent() {
    }

    public Agent(String name,
                 String email,
                 String phone,
                 String area,
                 int experienceYears) {

        super(0, name, email);

        this.phone = phone;
        this.area = area;
        this.experienceYears = experienceYears;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}