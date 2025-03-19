package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves along high-speed highways.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " brakes to a complete stop.");
    }
}
