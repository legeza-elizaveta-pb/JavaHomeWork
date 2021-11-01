package com.pb.legeza.hw5;

public class Book {
    private String name;
    private String author;
    private String year;

    public Book(String name, String author,String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void getYear(String year) {
        this.year = year;
    }

    String getInfo() {
        return "[Наименование произедения : " + name + ", Автор : " + author + ", Год выпуска : " + year + " ]";
    }
}