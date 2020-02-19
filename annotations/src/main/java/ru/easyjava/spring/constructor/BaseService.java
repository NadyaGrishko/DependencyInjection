package ru.easyjava.spring.constructor;

import org.springframework.stereotype.Service;

@Service
public class BaseService {
    public Boolean isMany(Integer number) { return number > 5;}
}
