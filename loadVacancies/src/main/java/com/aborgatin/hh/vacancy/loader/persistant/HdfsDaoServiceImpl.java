package com.aborgatin.hh.vacancy.loader.persistant;

import com.aborgatin.hh.vacancy.loader.model.Vacancy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HdfsDaoServiceImpl implements DaoService {
    @Override
    public boolean saveVacancies(List<Vacancy> vacancies) {
        return false;
    }
}
