package com.john.cole.admission.admissionprocess.controllers;

import java.util.List;

import com.john.cole.admission.admissionprocess.models.Application;
import com.john.cole.admission.admissionprocess.repositories.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.ui.Model;

@Controller
public class AdminController {
    Repository<Application>  appRepostitory;

    @Autowired
    public AdminController(PostgresApplicationRepository repository) {
        appRepostitory = repository;
    }

    @GetMapping("/admin")
    public String getAdminHome(Model model) {
        List<Application> applications = appRepostitory.findAll();
        model.addAttribute("applications", applications);
        return "admin_home";
    }
}
