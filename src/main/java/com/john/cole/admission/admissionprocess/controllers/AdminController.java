package com.john.cole.admission.admissionprocess.controllers;

import java.util.List;

import com.john.cole.admission.admissionprocess.models.Application;
import com.john.cole.admission.admissionprocess.models.SortByForm;
import com.john.cole.admission.admissionprocess.repositories.PostgresApplicationRepository;
import com.john.cole.admission.admissionprocess.repositories.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.ui.Model;

@Controller
public class AdminController {
    Repository<Application> appRepostitory;

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

    @PostMapping("/admin")
    public String sortBy(Model model, SortByForm form){
        String option = form.getSortOption();
        List<Application> applications;

        if (option.equals("school")){
            applications = appRepostitory.findAllBySchool();
        }else if (option.equals("eligible")){
            applications = appRepostitory.findAllEligible();
        }else if (option.equals("noneligible")){
            applications = appRepostitory.findAllNonEligible();
        }else{
            applications = appRepostitory.findAll();
        }

        model.addAttribute("applications", applications);
        return "admin_home";
    }

    @GetMapping("/admin/applicants/{id}")
    public String index(Model model, @PathVariable(value = "id") String id) {
        var app = appRepostitory.findById(Integer.parseInt(id));
        if (app.isPresent()) {
            model.addAttribute("applicant", app.get());
            return "applicant_page";
        } else {
            return "404";
        }
    }

    
}
