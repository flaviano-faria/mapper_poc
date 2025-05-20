package com.mapper.model;

public class Car {

    private int id;
    private String name;
    private String color;

    public Car() {}

    public Car(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private String name;
        private String color;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(id, name, color);
        }
    }
}
