package ru.top.oop.models;

public class Book {
    public String name;
    public String author;
    public int yearRelease;
    public String namePublishing;
    public String genre;
    public int pages;


    {
        name = "Евгений Онегин";
        author = "А.С.Пушкин";
        yearRelease = 1833;
        namePublishing = "Типография Александра Смирдина";
        genre = "Роман в стихах";
        pages = 287;
    }


    public Book(String name, String author, int yearRelease, String namePublishing, String genre, int pages) {
        this.name = name;
        this.author = author;
        this.yearRelease = yearRelease;
        this.namePublishing = namePublishing;
        this.genre = genre;
        this.pages = pages;
        System.out.println("Название книги: " + name);
        System.out.println("ФИО автора: " + author);
        System.out.println("Год выпуска: " + yearRelease);
        System.out.println("Название издательства: " + namePublishing);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + pages);
        System.out.println("\n");
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public String getNamePublishing() {
        return namePublishing;
    }
    public String getGenre() {
        return genre;
    }
    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }
    public void setNamePublishing(String namePublishing){
        this.namePublishing = namePublishing;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
}