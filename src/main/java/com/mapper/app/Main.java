package com.mapper.app;

import com.mapper.model.Car;
import com.mapper.service.CarService;

public class Main {
    public static void main(String[] args) {

        CarService service = new CarService();
        service.printCar(Car.builder().id(1).name("BMW").color("Black").build());
    }
}