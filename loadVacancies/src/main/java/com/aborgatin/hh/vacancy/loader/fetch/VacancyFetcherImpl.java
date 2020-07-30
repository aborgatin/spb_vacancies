package com.aborgatin.hh.vacancy.loader.fetch;

import com.aborgatin.hh.vacancy.loader.model.Response;
import com.aborgatin.hh.vacancy.loader.model.Vacancy;
import com.aborgatin.hh.vacancy.loader.persistant.DaoService;
import com.aborgatin.hh.vacancy.loader.provider.VacancyProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class VacancyFetcherImpl implements VacancyFetcher {

    private VacancyProvider vacancyProvider;
    private DaoService daoService;

    @PostConstruct
    public void init() {
        fetch();
    }

    @Autowired
    public void setVacancyProvider(VacancyProvider vacancyProvider) {
        this.vacancyProvider = vacancyProvider;
    }

    @Autowired
    public void setDaoService(DaoService daoService) {
        this.daoService = daoService;
    }

    @Override
    @Scheduled()
    public void fetch() {
        Response<Vacancy> allVacancies = vacancyProvider.getAllVacancies();
        daoService.saveVacancies(allVacancies.getItems());
    }
}
