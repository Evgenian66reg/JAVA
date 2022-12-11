package ru.top.oop.models;

public class Country {
    public String name;
    public int population;
    public double area;
    public String capital;

    public Country(String name,int population,double area,String capital){
        this.name = name;
        this.population = population;
        this.area = area;
        this.capital = capital;
        System.out.println("Название страны: " + name);
        System.out.println("Количество населения: " + population + " человек");
        System.out.println("Площадь страны: " + area + " км2");
        System.out.println("Столица: " + capital);
        System.out.println("\n");
    }

    public void allInfoCountry(String name,int population,double area,String capital){
        this.name = name;
        this.population = population;
        this.area = area;
        this.capital = capital;
        System.out.println("Название страны: " + name);
        System.out.println("Количество населения: " + population + " человек");
        System.out.println("Площадь страны: " + area + " км2");
        System.out.println("Столица: " + capital);
        System.out.println("\n");
    }
}
