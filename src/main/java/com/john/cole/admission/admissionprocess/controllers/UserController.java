package com.john.cole.admission.admissionprocess.controllers;

import com.john.cole.admission.admissionprocess.models.Application;
import com.john.cole.admission.admissionprocess.repositories.PostgresApplicationRepository;
import com.john.cole.admission.admissionprocess.repositories.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController{
    Repository<Application> appRepostitory;

    @Autowired
    public UserController(PostgresApplicationRepository repository) {
        appRepostitory = repository;
    }

    @GetMapping("/user")
    public String getUserHome(){
        return "user_home";        
    }

    @GetMapping("/user/apply")
    public String getForm(){
        return "application_form";        
    }

    @PostMapping("/user/apply")
    public String postForm(Application app){
        appRepostitory.addApplication(app);
        return "redirect:/user";
    }
}
