package com.realestate.repository;

import com.realestate.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepository {

    private final ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> findAll() {
        return users;
    }

    public User findById(int id) {

        for (User user : users) {

            if (user.getUserId() == id) {
                return user;
            }
        }

        return null;
    }

    public User save(User user) {

        users.add(user);

        return user;
    }

    public User update(int id, User newUser) {

        User oldUser = findById(id);

        if (oldUser != null) {

            oldUser.setName(newUser.getName());
            oldUser.setEmail(newUser.getEmail());
        }

        return oldUser;
    }

    public boolean delete(int id) {

        User user = findById(id);

        return users.remove(user);
    }
}