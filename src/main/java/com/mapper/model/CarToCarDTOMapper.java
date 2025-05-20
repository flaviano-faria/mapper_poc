package com.mapper.model;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarToCarDTOMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "carColor", source = "color")
    @Mapping(target = "carModel", source = "name")
    CarDTO carToCarDTO(Car car);
}
