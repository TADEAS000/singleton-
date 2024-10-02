package com.company;

public class CarBuilder {
    String engine;
    String color;
    String wheels;

    public CarBuilder addEngine(String engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder addColor(String color){
        this.color = color;
        return this;
    }

    public CarBuilder addWheels(String wheels){
        this.wheels = wheels;
        return this;
    }

    public Car build(){
        if ((engine == null || engine.isEmpty()) || (color == null || color.isEmpty()) || (wheels == null || wheels.isEmpty())){
            throw new IllegalArgumentException("Longtitude and latitude can't be empty.");
        }
        return new Car(engine, color, wheels);
    }
}
