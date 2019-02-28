package com.john.cole.admission.admissionprocess.models;

import javax.validation.constraints.NotNull;

public class Application {

    public Integer id;

    @NotNull
    public String name;

    @NotNull
    public String email;

    @NotNull
    public String school;

    @NotNull
    public Boolean eligible;

    public Integer age;

    public String phone;

    public String graduation;

    public String aptitude;

    public String dedication;

    public String passion;

    public String meeting;

    public Application(Integer id, String name, String email, String school, Boolean eligible, Integer age, String phone,
            String graduation, String aptitude, String dedication, String passion, String meeting) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.school = school;
        this.eligible = eligible;
        this.age = age;
        this.phone = phone;
        this.graduation = graduation;
        this.aptitude = aptitude;
        this.dedication = dedication;
        this.passion = passion;
        this.meeting = meeting;
    }

    

    public String createGraduation(String graduationDay, String graduationMonth) {
        return graduationDay + "-" + graduationMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Boolean getEligible() {
        return eligible;
    }

    public void setEligible(Boolean eligible) {
        this.eligible = eligible;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getAptitude() {
        return aptitude;
    }

    public void setAptitude(String aptitude) {
        this.aptitude = aptitude;
    }

    public String getDedication() {
        return dedication;
    }

    public void setDedication(String dedication) {
        this.dedication = dedication;
    }

    public String getPassion() {
        return passion;
    }

    public void setPassion(String passion) {
        this.passion = passion;
    }

    public String getMeeting() {
        return meeting;
    }

    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    public int getId() {
        return id;
    }


}
