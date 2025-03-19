package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves on rails.");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " brakes to a complete stop.");
    }
}
