package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is flying.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " decreases altitude and stops.");
    }
}
