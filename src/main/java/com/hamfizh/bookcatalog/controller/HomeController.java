package com.hamfizh.bookcatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String displayHome(@RequestParam String name, Model model){
        model.addAttribute("name", "Hamfizh");
        return "home";
    }
}
