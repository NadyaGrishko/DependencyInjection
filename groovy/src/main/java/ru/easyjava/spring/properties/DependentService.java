package ru.easyjava.spring.properties;

import org.springframework.stereotype.Service;
import ru.easyjava.spring.BaseRepository;
import ru.easyjava.spring.BaseService;

@Service
public class DependentService {
    private BaseRepository repository;
    private BaseService service;

    public void setRepository(BaseRepository r) {
        this.repository = r;
    }

    public void setService(BaseService s) {
        this.service = s;
    }

    public String process() {
        if (service. isMany(repository.count())) {
            return "Too big number";
        } else
            return "Everything is fine";
    }
}