package ru.easyjava.spring.reflection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
          new AnnotationConfigApplicationContext("ru.easyjava.spring.reflection");
        DependentService dependent = context.getBean(DependentService.class);

        System.out.println(dependent.process());
    }
}
