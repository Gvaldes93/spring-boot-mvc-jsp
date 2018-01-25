package com.german.tutorial.spring.mvc.services;

import com.german.tutorial.spring.mvc.model.User;

public interface UserService {

   void createUser(String name);

   User getUser(String name);
}
