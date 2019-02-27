package com.john.cole.admission.admissionprocess.controllers;

import com.john.cole.admission.admissionprocess.models.Application;
import com.john.cole.admission.admissionprocess.repositories.PostgresApplicationRepository;
import com.john.cole.admission.admissionprocess.repositories.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.ui.Model;

@Controller
public class AdminController{
    Repository<Application> appRepostitory;

    @Autowired
    public AdminController(PostgresApplicationRepository repository) {
        appRepostitory = repository;
    }

    @GetMapping("/admin")
    public String getAdminHome(){
        return "admin_home";        
    }
}
