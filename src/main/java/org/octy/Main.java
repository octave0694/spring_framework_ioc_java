package org.octy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        System.out.println();
        System.out.println("***Hello SPRING!***\n");
        System.out.println(context.getBean(Person.class));
    }
}