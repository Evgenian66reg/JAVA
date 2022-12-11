package ru.top.oop.models;

public class City {
    public String name;
    public int population;
    public double area;

    public City(String name,int population,double area) {
        this.name = name;
        this.population = population;
        this.area = area;
        System.out.println("Название города: " + name);
        System.out.println("Количество населения: " + population + " человек");
        System.out.println("Площадь города: " + area + " км2");
        System.out.println("\n");
    }

    public void allInfoCity(String name,int population,double area) {
        this.name = name;
        this.population = population;
        this.area = area;
        System.out.println("Название города: " + name);
        System.out.println("Количество населения: " + population + " человек");
        System.out.println("Площадь города: " + area + " км2");
        System.out.println("\n");
    }
}
