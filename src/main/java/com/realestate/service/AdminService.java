package com.realestate.service;

import com.realestate.model.Admin;
import com.realestate.repository.AdminRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AdminService {
    private final AdminRepository adminRepository;
    public AdminService(AdminRepository adminRepository) { this.adminRepository = adminRepository; }
    public ArrayList<Admin> getAllAdmins() { return adminRepository.findAll(); }
    public Admin getAdminById(int id) { return adminRepository.findById(id); }
    public Admin addAdmin(Admin admin) { return adminRepository.save(admin); }
    public Admin updateAdmin(int id, Admin admin) { return adminRepository.update(id, admin); }
    public boolean deleteAdmin(int id) { return adminRepository.delete(id); }
}
