package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;

        System.out.println(student);
        System.out.println(object);
    }
}
