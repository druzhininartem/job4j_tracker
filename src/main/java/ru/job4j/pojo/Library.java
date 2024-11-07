package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 464);
        Book book2 = new Book("Effective Java", 416);
        Book book3 = new Book("Head First Java", 688);
        Book book4 = new Book("Java Concurrency in Practice", 432);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        System.out.println("Все книги:");
        for (Book book : books) {
            System.out.printf("%s - %d страниц%n", book.getName(), book.getPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        System.out.println("\nПосле перестановки книг с индексом 0 и 3:");
        for (Book book : books) {
            System.out.printf("%s - %d страниц%n", book.getName(), book.getPages());
        }

        System.out.println("\nКниги с именем 'Clean code':");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.printf("%s - %d страниц%n", book.getName(), book.getPages());
            }
        }
    }
}
