package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();

        license.setOwner("Artem Druzhinin");
        license.setModel("Toyota");
        license.setCode("aa777d");
        license.setCreated(new Date());

        System.out.printf("%s has a car - %s : %s : %s%n", license.getOwner(), license.getModel(), license.getCode(),
                license.getCreated());
    }
}
