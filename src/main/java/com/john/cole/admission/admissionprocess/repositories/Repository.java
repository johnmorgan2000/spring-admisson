package com.john.cole.admission.admissionprocess.repositories;

import com.john.cole.admission.admissionprocess.models.Application;

@Repository
public interface Repository<T> {
    void addApplication(Application app);
}
