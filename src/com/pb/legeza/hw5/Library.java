package com.pb.legeza.hw5;


public class Library {public static void main(String[] args) {
    Reader reader1 = new Reader("Петров В.В.", 1, "ИФ", "21.10.1999", "+806711111");
    Reader reader2 = new Reader("Иванов И.И.", 2, "ИФ", "11.11.1997", "+806722222");
    Reader reader3 = new Reader("Сидоров А.А.", 3, "ИФ", "05.04.2005", "+806733333");
    Reader[] readers = {reader1, reader2, reader3};

    Book book1 = new Book("Приключения", "Иванов И. И. ","2000 г.");
    Book book2 = new Book("Словарь", "Сидоров А. В.","1980 г.");
    Book book3 = new Book("Энциклопедия", "Гусев К. В.","2010 г.");
    Book[] books = {book1, book2, book3};

    printReaders(readers);
    printBooks(books);

    reader1.takeBook(3);
    reader1.takeBook(book1.getName(),book2.getName(),book3.getName());
    reader1.takeBook(book1,book2,book3);

    reader1.returnBook(3);
    reader2.returnBook(book1.getName(),book2.getName(),book3.getName());
    reader3.returnBook(book1,book2,book3);
}

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}