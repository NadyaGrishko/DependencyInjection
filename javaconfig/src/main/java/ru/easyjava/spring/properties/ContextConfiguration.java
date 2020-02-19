package ru.easyjava.spring.properties;

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
    public DependentService dependent() {
        DependentService dependent = new DependentService();
        dependent.setRepository(baseRepository());
        dependent.setService(baseService());

        return dependent;
    }
}
