package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFullName("Druzhinin Artem Andreyevich");
        student.setGroup("job4j 777");
        student.setEnrollmentDate(new Date());

        System.out.printf("ФИО: %s%n", student.getFullName());
        System.out.printf("Группа: %s%n", student.getGroup());
        System.out.printf("Дата поступления: %s%n", student.getEnrollmentDate());
    }
}
