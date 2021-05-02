package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("/dashboard")
    public ModelAndView dashboard(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping("/typography")
    public ModelAndView typography() {
        ModelAndView mv = new ModelAndView("typography");
        return mv;
    }

    @GetMapping("/glyphicon")
    public ModelAndView glyphicon() {
        ModelAndView mv = new ModelAndView("glyphicon");
        return mv;
    }

    @GetMapping("/grids")
    public ModelAndView grids() {
        ModelAndView mv = new ModelAndView("grids");
        return mv;
    }

    @GetMapping("/shop")
    public ModelAndView LoginPage() {
        ModelAndView mv = new ModelAndView("shop");
        return mv;
    }

}