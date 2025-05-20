package com.mapper.model;

public class CarDTO {

    private int id;
    private String carColor;
    private String carModel;

    public CarDTO() {}

    public CarDTO(int id, String carColor, String carModel) {
        this.id = id;
        this.carColor = carColor;
        this.carModel = carModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
