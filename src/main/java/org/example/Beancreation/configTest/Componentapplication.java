package org.example.Beancreation.configTest;

import org.example.Beancreation.Car.CarDesign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.example.Beancreation")

public class Componentapplication {
    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Componentapplication.class, args);
        CarDesign carBean = (CarDesign) ctx.getBean("CarBean");
        carBean.Petrol();
    }
}


