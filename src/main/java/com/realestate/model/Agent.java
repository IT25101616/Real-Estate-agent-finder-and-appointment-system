package com.realestate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "agents")
public class Agent extends Person {

    private String phone;
    private String area;
    private int experienceYears;

    public Agent() {
    }

    public Agent(String name, String email, String phone, String area, int experienceYears) {
        super(name, email);
        this.phone = phone;
        this.area = area;
        this.experienceYears = experienceYears;
    }

    @Override
    public String getRoleName() {
        return "Agent";
    }

    public String getPhone() {
        return phone;
    }

    public String getArea() {
        return area;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
