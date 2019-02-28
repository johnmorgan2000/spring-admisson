package com.john.cole.admission.admissionprocess.repositories;

import java.util.List;
import java.util.Optional;

import com.john.cole.admission.admissionprocess.models.Application;

public interface Repository<T> {
    void addApplication(Application app);

    List<Application> findAll();

    List<Application> findAllEligible();

    List<Application> findAllBySchool();

    List<Application> findAllNonEligible();

    Optional<T> findById(int id);
}
