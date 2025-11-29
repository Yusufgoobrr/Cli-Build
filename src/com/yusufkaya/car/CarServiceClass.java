package com.yusufkaya.car;

public class CarServiceClass extends Car {
    public void getAllCars(Car cars,int size) {
        for(int i =0;i<size;i++){
                System.out.println(cars);

        }
    }

    public void getAllElectricCars(Car cars,int size) {
for(int i =0;i<size;i++){
    if(cars.isElectric()){
        System.out.println(cars);
    }
}
    }
}