package com.company;

public class Car {
    String brand;
    String name;
    String color;
    int year;


    public Car(String brand, String name, String color, int year) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
    }
}
