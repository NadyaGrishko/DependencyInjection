package ru.easyjava.spring.constructor;

import org.springframework.context.annotation.Bean;
import ru.easyjava.spring.BaseRepository;
import ru.easyjava.spring.BaseService;

/**
 * Spring context configuration descriptor.
 */
public class ContextConfiguration {
    @Bean
    public BaseRepository baseRepository() { return new BaseRepository(); }

    @Bean
    public BaseService baseService() { return new BaseService(); }

    @Bean
    public DependentService dependent() { return new DependentService(baseRepository(), baseService()); }
}
