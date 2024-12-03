package org.example.Beancreation.BeanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {



    @Bean
 public javaconfigBean javaconfigBean(){
        return new javaconfigBean();

    }
}
