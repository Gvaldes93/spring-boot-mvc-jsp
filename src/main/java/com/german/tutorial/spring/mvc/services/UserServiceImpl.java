package com.german.tutorial.spring.mvc.services;

import com.german.tutorial.spring.mvc.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> users = new ArrayList<>();

    @Override
    public void createUser(String name) {
        this.users.add(new User(name));
    }

    @Override
    public User getUser(String name) {
        return this.users
                .stream()
                .filter(user -> user.getName().equals(name))
                .findFirst().orElse(null);
    }


}
