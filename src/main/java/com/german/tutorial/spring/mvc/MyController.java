package com.german.tutorial.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController{

    @GetMapping("/greetings")
    public ModelAndView greeting () {
        ModelAndView model = new ModelAndView("greeting");
        model.addObject("name", "German");
        return model;
    }
}
