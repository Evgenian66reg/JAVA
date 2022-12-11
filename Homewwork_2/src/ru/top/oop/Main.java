package ru.top.oop;

import ru.top.oop.models.*;

public class Main {
    public static void main(String[] args)
    {
        City city = new City("Москва",13010112,2561.5);
        city.allInfoCity("Екатеринбург",1544376,1147.7);

        Country country = new Country("Россия",146570156,17098242,"Москва");
        country.allInfoCountry("Азербайджан",10191609,86600,"Баку");

        Human human = new Human("Иван","Иванов",34,"мужчина");
        human.allInfoHuman("Ольга","Юрьева",44,"женщина");
        human.fullName("Николай","Викторов");

        Book book = new Book("Отцы и дети","И.С.Тургенев",1862,"Русский вестник","Роман",204);
        System.out.println("Жанр: " + book.getGenre());
        book.setPages(211);
        System.out.println("Количество страниц: " + book.getPages());
        System.out.println("\n");

        Car car = new Car("Lotus Elise","Lotus Cars",2000,1797);
        System.out.println("Объем двигателя: " + car.getEngine() + " см3");
        car.setEngine(1598);
        System.out.println("Объем двигателя: " + car.getEngine() + " см3");
    }
}