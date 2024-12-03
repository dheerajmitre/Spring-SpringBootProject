package org.example.Beancreation.BeanCreation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Appconfig.class)
public class javaconfigapp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(javaconfigapp.class, args);
        javaconfigapp bean = (javaconfigapp) ctx.getBean("javaconfigapp");
        javaconfigapp bean1 = (javaconfigapp) ctx.getBean("javaconfigapp");

        System.out.println("Hashcode of bean is " + bean.hashCode());
        System.out.println("hashcode of bean is " + bean1.hashCode());

    }
}

