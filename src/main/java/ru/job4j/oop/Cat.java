package ru.job4j.oop;

public class Cat {
    public String sound() {
        return "may-may";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String peppySay = peppy.sound();
        String sparkySay = sparky.sound();
        System.out.println("Peppy says " + peppySay);
        System.out.println("Sparky says " + sparkySay);
    }
}

