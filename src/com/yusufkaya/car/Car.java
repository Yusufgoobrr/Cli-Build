package com.yusufkaya.car;

import java.util.Objects;
import java.util.UUID;

public class Car {
    private UUID carId;
    private String brand;
    private String model;
    private String color;
    private int manufacture_date;
    private boolean isElectric;

    public Car() {
    }

    public Car(String brand, String model, String color, int manufacture_date, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacture_date = manufacture_date;
        this.isElectric = isElectric;
    }

    public Car(UUID carId, String brand, String model, String color, int manufacture_date, boolean isElectric) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacture_date = manufacture_date;
        this.isElectric = isElectric;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufacture_date() {
        return manufacture_date;
    }

    public void setManufacture_date(int manufacture_date) {
        this.manufacture_date = manufacture_date;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacture_date == car.manufacture_date &&
                isElectric == car.isElectric &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, manufacture_date, isElectric);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", manufacture_date=" + manufacture_date +
                ", isElectric=" + isElectric +
                '}';
    }
}