package org.example.Beancreation.BeanCreation;


import org.example.Beancreation.Car.CarDesign;

public class javaconfigBean implements CarDesign {
    @Override
    public void Petrol() {
        System.out.println("i am java config bean");
    }
}
