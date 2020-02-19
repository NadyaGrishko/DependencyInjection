package ru.easyjava.spring.properties;

import org.springframework.stereotype.Service;

@Service
public class BaseService {
    public Boolean isMany(Integer number) { return number > 5;}
}
