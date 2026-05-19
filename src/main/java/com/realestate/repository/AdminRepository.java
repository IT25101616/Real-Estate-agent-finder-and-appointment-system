package com.realestate.repository;

import com.realestate.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AdminRepository {

    private final ArrayList<Admin> admins = new ArrayList<>();

    public ArrayList<Admin> findAll() {
        return admins;
    }

    public Admin findById(int id) {
        for (Admin admin : admins) {
            if (admin.getUserId() == id) {
                return admin;
            }
        }
        return null;
    }

    public Admin save(Admin admin) {
        admins.add(admin);
        return admin;
    }

    public Admin update(int id, Admin newAdmin) {
        Admin oldAdmin = findById(id);

        if (oldAdmin != null) {
            oldAdmin.setName(newAdmin.getName());
            oldAdmin.setEmail(newAdmin.getEmail());
            oldAdmin.setRole(newAdmin.getRole());
        }

        return oldAdmin;
    }

    public boolean delete(int id) {
        Admin admin = findById(id);
        return admins.remove(admin);
    }
}