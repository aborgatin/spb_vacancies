package com.aborgatin.hh.vacancy.loader.persistant;

import com.aborgatin.hh.vacancy.loader.model.Vacancy;

import java.util.List;

public interface DaoService {
    boolean saveVacancies(List<Vacancy> vacancies);
}
