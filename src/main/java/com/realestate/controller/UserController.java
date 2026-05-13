package com.realestate.controller;

import com.realestate.model.User;
import com.realestate.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping
    public ArrayList<User> getAllUsers() { return userService.getAllUsers(); }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) { return userService.getUserById(id); }

    @PostMapping
    public User addUser(@RequestBody User user) { return userService.addUser(user); }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) { return userService.updateUser(id, user); }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) { return userService.deleteUser(id) ? "User deleted" : "User not found"; }
}
