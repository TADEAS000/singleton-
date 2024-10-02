package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarDealershipSingleton {

    static CarDealershipSingleton carDealershipSingleton;

    static List<Car> carList = new ArrayList<Car>();

    public CarDealershipSingleton() {


    }

    public static CarDealershipSingleton getInstance(){
        if (carDealershipSingleton == null){
            synchronized (CarDealershipSingleton.class){
                carDealershipSingleton =  new CarDealershipSingleton();
                carDealershipSingleton.setCarsList(new ArrayList<Car>());
            }
        }
        return carDealershipSingleton;
    }

    public CarDealershipSingleton(List<Car> carsList) {
        this.carList = carsList;
    }

    public static CarDealershipSingleton getInstance(List<Car> cars){
        if (carDealershipSingleton == null){
            carDealershipSingleton =  new CarDealershipSingleton();
            carDealershipSingleton.setCarsList(new ArrayList<Car>());
        }
        carDealershipSingleton.setCarsList(cars);
        return carDealershipSingleton;
    }

    public void orderCar (Car car) throws ClassNotFoundException, IllegalAccessException {
        carList.add(car);
        System.out.println("Order: "+car.engine+" "+car.color+" "+car.wheels);
    }

    public void printOrders(){
        System.out.println(carList);
    }

    public static CarDealershipSingleton getCarDealershipSingleton() {
        return carDealershipSingleton;
    }

    public List<Car> getCarList(){
        return carList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carList = carsList;
    }
}
