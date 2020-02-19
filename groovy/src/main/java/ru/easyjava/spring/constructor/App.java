package ru.easyjava.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * Application main class.
 */
public final class App {
    /**
     * Do not construct me.
     */
    private App() { };

    /**
     * Application entry point.
     * @param args Array of command line arguments.
     */
    public static void main(final String[] args) {
        ApplicationContext context =
          new GenericGroovyApplicationContext("/applicationContextConstructor.groovy");
        DependentService dependent = context.getBean(DependentService.class);

        System.out.println(dependent.process());
    }
}
