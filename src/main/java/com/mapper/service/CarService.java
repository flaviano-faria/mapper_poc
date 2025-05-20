package com.mapper.service;

import com.mapper.model.Car;
import com.mapper.model.CarDTO;
import com.mapper.model.CarToCarDTOMapper;
import org.mapstruct.factory.Mappers;


public class CarService {

    public void printCar(Car car){
        CarToCarDTOMapper mapper = Mappers.getMapper(CarToCarDTOMapper.class);
        CarDTO carDTO = mapper.carToCarDTO(car);

        System.out.println(carDTO.getId() + " " + carDTO.getCarColor() + " " + carDTO.getCarModel());
    }

}
