package ru.easyjava.spring.properties;

import org.springframework.stereotype.Service;
import javax.inject.Inject;

@Service
public class DependentService {
    private BaseRepository repository;
    private BaseService service;

    @Inject
    public void setRepository(BaseRepository r) {
        this.repository = r;
    }

    @Inject
    public void setService(BaseService s) {
        this.service = s;
    }

    public String process() {
        if (service.isMany(repository. count())) {
            return "Too big number";
        } else
            return "Everything is fine";
    }
}
