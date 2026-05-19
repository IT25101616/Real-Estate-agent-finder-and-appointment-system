package com.realestate.controller;

import com.realestate.model.Admin;
import com.realestate.service.AdminService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/admins")
public class AdminController {
    private final AdminService adminService;
    public AdminController(AdminService adminService) { this.adminService = adminService; }

    @GetMapping
    public ArrayList<Admin> getAllAdmins() { return adminService.getAllAdmins(); }

    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable int id) { return adminService.getAdminById(id); }

    @PostMapping
    public Admin addAdmin(@RequestBody Admin admin) { return adminService.addAdmin(admin); }

    @PutMapping("/{id}")
    public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) { return adminService.updateAdmin(id, admin); }

    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable int id) { return adminService.deleteAdmin(id) ? "Admin deleted" : "Admin not found"; }
}
