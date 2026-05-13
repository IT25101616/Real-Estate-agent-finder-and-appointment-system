package com.realestate.service;

import com.realestate.model.User;
import com.realestate.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ArrayList<User> getAllUsers() { return userRepository.findAll(); }
    public User getUserById(int id) { return userRepository.findById(id); }
    public User addUser(User user) { return userRepository.save(user); }
    public User updateUser(int id, User user) { return userRepository.update(id, user); }
    public boolean deleteUser(int id) { return userRepository.delete(id); }
}
