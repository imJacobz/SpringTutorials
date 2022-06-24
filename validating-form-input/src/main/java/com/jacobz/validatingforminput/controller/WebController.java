package com.jacobz.validatingforminput.controller;

import com.jacobz.validatingforminput.entity.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
public class WebController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/result").setViewName("result");
    }


    @GetMapping({"/", "/form"})
    public String showForm(UserAccount userAccount) {
        return "form";
    }

    @PostMapping({"/", "/form"})
    public String checkPersonInfo(@Valid UserAccount userAccount, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }

        return "redirect:/result";
    }
}
