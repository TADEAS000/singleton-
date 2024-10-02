package com.company;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
            CarDealershipSingleton carDealershipSingleton = CarDealershipSingleton.getInstance();

        Car car = Car.builder().addColor("Blue").addEngine("Electric").addWheels("sport").build();
        carDealershipSingleton.orderCar(car);
        Car car2 = Car.builder().addColor("Red").addEngine("2.0").addWheels("offroad").build();
        carDealershipSingleton.orderCar(car2);
        carDealershipSingleton.printOrders();
    }

}