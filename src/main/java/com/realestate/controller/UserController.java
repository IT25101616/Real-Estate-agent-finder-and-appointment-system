package com.realestate.controller;

import com.realestate.model.User;
import com.realestate.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // REGISTER
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.create(user);
    }

    // LOGIN
    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        return userService.login(user.getEmail(), user.getPassword());
    }

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }

    // READ ALL
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.delete(id) ? "User deleted successfully" : "User not found";
    }
}
