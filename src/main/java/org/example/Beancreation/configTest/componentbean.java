package org.example.Beancreation.configTest;

import org.example.Beancreation.Car.CarDesign;
import org.springframework.stereotype.Component;

@Component("CarBean")
public class componentbean implements CarDesign {

    public void Petrol() {
        System.out.println("Hello i am component scan bean");
    }
}
