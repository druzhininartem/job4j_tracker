package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Error Active: " + active);
        System.out.println("Error Status: " + status);
        System.out.println("Error Message: " + message);
    }

    public static void main(String[] args) {
        Error first = new Error();
        Error second = new Error(false, 404, "Page not found.");
        Error third = new Error(true, 500, "Connection error.");

        first.printInfo();
        second.printInfo();
        third.printInfo();
    }
}
