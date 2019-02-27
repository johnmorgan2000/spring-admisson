package com.john.cole.admission.admissionprocess.repositories;

import java.util.List;

import com.john.cole.admission.admissionprocess.models.Application;

public interface Repository<T> {
    void addApplication(Application app);

    List<Application> findAll();
}
