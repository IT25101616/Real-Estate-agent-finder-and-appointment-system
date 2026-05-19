package com.realestate.model;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {

    private String role;

    public Admin() {
    }

    public Admin(String name, String email, String role) {

        super(0, name, email);

        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
