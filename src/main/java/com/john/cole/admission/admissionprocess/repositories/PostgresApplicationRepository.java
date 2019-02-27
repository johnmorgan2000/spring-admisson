package com.john.cole.admission.admissionprocess.repositories;

import com.john.cole.admission.admissionprocess.models.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PostgresApplicationRepository implements com.john.cole.admission.admissionprocess.repositories.Repository<Application> {
    private JdbcTemplate jdbc;

    @Autowired
    public PostgresApplicationRepository(JdbcTemplate jdbcTemplate){
        jdbc = jdbcTemplate;
    }

    public void addApplication(Application app){
        String columns = "name, email, school, eligible, age, phone, graduation, aptitude, dedication, passion";
        jdbc.update(
            "INSERT INTO applications (" + columns + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);" ,
            app.getName(),
            app.getEmail(),
            app.getSchool(),
            app.getEligible(),
            app.getAge(),
            app.getPhone(),
            app.getGraduation(),
            app.getAptitude(),
            app.getDedication(),
            app.getPassion()
            );
    }

    public String[] findAll(){
        return jdbc.query("SELECT * FROM applications;", );
    }

    
}
