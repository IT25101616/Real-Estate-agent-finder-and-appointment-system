package com.realestate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends Person {

    private String password;
    private String phone;

    public User() {
    }

    public User(String name, String email, String password, String phone) {
        super(name, email);
        this.password = password;
        this.phone = phone;
    }

    @Override
    public String getRoleName() {
        return "User";
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
