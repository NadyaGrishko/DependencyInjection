package ru.easyjava.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
          new ClassPathXmlApplicationContext("/applicationContextProperties.xml");
        DependentService dependent = context.getBean(DependentService.class);

        System.out.println(dependent.process());
    }
}
