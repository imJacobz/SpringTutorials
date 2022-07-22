package com.jacobz.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showMotherPage(Model model) {
        model.addAttribute("path", "dashboard");
        return "app";
    }

    @GetMapping("/user/{path}")
    public String showUserSubPages(@PathVariable String path, Model model) {
        model.addAttribute("path", "user/" + path);
        return "app";
    }

    @GetMapping("/{path}")
    public String showSubPages(@PathVariable String path, Model model) {
        if (!StringUtils.hasText(path)) {
            path = "dashboard";
        }
        model.addAttribute("path", path);
        return "app";
    }


}
