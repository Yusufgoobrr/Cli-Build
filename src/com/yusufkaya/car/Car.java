package com.yusufkaya.car;

import java.util.UUID;

public class Car {
    private UUID carId;
    private String brand;
    private String model;
    private String color;
    private int manufactureYear;
    private boolean isElectric;
    private boolean isAvailable;

    public Car() {
    }

    public Car(UUID carId, String brand, String model, String color, int manufactureYear, boolean isElectric) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.isElectric = isElectric;
        this.isAvailable = true;
    }

    // Getters and setters
    public UUID getCarId() { return carId; }
    public void setCarId(UUID carId) { this.carId = carId; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public int getManufactureYear() { return manufactureYear; }
    public void setManufactureYear(int manufactureYear) { this.manufactureYear = manufactureYear; }
    public boolean isElectric() { return isElectric; }
    public void setElectric(boolean electric) { isElectric = electric; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "Car{carId=" + carId + ", brand='" + brand + "', model='" + model + "', electric=" + isElectric + ", available=" + isAvailable + "}";
    }
}