package org.octy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    
    @Bean(name = "person")
    public Person person(){
        return new Person();
    }
    
    @Bean(name = "adress")
    public Adress adress(){return new Adress();}
}
