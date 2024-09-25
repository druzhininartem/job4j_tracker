package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.printf("%s's food is %s%n", this.name, this.food);
    }

    public String sound() {
        return "may-may";
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("cutlet");
        gav.show();

        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();

        Cat peppy = new Cat();
        Cat sparky = new Cat();
        String peppySay = peppy.sound();
        String sparkySay = sparky.sound();
        System.out.println("Peppy says " + peppySay);
        System.out.println("Sparky says " + sparkySay);
    }
}

