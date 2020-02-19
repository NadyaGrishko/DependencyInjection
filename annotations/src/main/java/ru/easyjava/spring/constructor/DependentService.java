package ru.easyjava.spring.constructor;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class DependentService {
    private final BaseRepository repository;
    private final BaseService service;

    @Inject
    public DependentService(final BaseRepository r, BaseService s) {
        this.repository = r;
        this.service = s;
    }

    public String process() {
        if (service.isMany(repository.count())) {
            return "Too big number";
        } else
            return "Everything is fine";
    }
}
