package com.john.cole.admission.admissionprocess.models;

import javax.validation.constraints.NotNull;

public class SortByForm{
    @NotNull
    public String sortOption;

    public String getSortOption() {
        return sortOption;
    }

    public void setSortOption(String sortBtn) {
        this.sortOption = sortBtn;
    }

    
}
