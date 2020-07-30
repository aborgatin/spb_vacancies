package com.aborgatin.hh.vacancy.loader.provider;

import com.aborgatin.hh.vacancy.loader.model.Response;
import com.aborgatin.hh.vacancy.loader.model.Vacancy;


public interface VacancyProvider {
    Response<Vacancy> getAllVacancies();
}
