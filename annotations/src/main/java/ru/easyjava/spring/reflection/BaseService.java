package ru.easyjava.spring.reflection;

import org.springframework.stereotype.Service;

@Service
public class BaseService {
    public Boolean isMany(Integer number) { return number > 5;}
}
