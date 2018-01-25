package com.german.tutorial.spring.mvc;

import com.german.tutorial.spring.mvc.model.User;
import com.german.tutorial.spring.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public String createUser (@RequestParam("create") String name) {
        userService.createUser(name);

        return "User created successfully!";
    }

    @GetMapping("/users/{name}")
    public ModelAndView getUser (@PathVariable("name") String name) {
        User user = userService.getUser(name);
        ModelAndView model = new ModelAndView("greeting");
        model.addObject("name", user.getName());
        return  model;
    }
}
