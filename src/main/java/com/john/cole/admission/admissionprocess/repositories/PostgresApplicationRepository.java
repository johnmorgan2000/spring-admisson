package com.john.cole.admission.admissionprocess.repositories;

import java.util.List;
import java.sql.ResultSet;
import java.util.Optional;
import java.sql.SQLException;

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
        String columns = "name, email, school, eligible, age, phone, graduation, aptitude, dedication, passion, meeting";
        jdbc.update(
            "INSERT INTO applications (" + columns + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);" ,
            app.getName(),
            app.getEmail(),
            app.getSchool(),
            app.getEligible(),
            app.getAge(),
            app.getPhone(),
            app.getGraduation(),
            app.getAptitude(),
            app.getDedication(),
            app.getPassion(),
            app.getMeeting()
            );
    }

    public List<Application> findAll(){
        return jdbc.query("SELECT * FROM applications ORDER BY school, name;", this::mapToApplication);
    }

    public Optional<Application> findById(int id) {

        return Optional.ofNullable(
                jdbc.queryForObject("SELECT * FROM applications WHERE id= ?;", this::mapToApplication ,id));
    }

    public Application mapToApplication(ResultSet rs, int rowNum) throws SQLException {
        return new Application(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("email"), 
            rs.getString("school"), 
            rs.getBoolean("eligible"), 
            rs.getInt("age"),
            rs.getString("phone"),
            rs.getString("graduation").toString(),
            rs.getString("aptitude"),
            rs.getString("dedication"),
            rs.getString("passion"),
            rs.getString("meeting").toString()
        );
    }

    
}
