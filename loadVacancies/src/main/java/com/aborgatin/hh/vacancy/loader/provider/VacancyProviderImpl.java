package com.aborgatin.hh.vacancy.loader.provider;

import com.aborgatin.hh.vacancy.loader.model.Response;
import com.aborgatin.hh.vacancy.loader.model.Vacancy;
import com.aborgatin.hh.vacancy.loader.util.UriConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class VacancyProviderImpl implements VacancyProvider {

    private String city;

    @Value("${vacancies.city}")
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Response<Vacancy> getAllVacancies() {
        Flux<Response<Vacancy>> vacFlux = WebClient.create()
                .get()
                .uri(UriConstants.VACANCIES_LIST+"?text=" + city)
                .retrieve()
                .bodyToFlux(new ParameterizedTypeReference<Response<Vacancy>>() {});

        return vacFlux.blockFirst();
    }
}
