package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("registration");
        return mv;
    }

    @GetMapping("/forgot")
    public ModelAndView forgot(){
        ModelAndView mv = new ModelAndView("forgot-password");
        return mv;
    }
}
