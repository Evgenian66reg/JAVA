package ru.top.oop.models;

public class Car {
    public String name;
    public String nameManufacturer;
    public int yearRelease;
    public double engine;


    {
        name = "Ауди А6";
        nameManufacturer = "Audi AG";
        yearRelease = 2018;
        engine = 2995;
    }

    public Car(String name, String nameManufacturer, int yearRelease, double engine) {
        this.name = name;
        this.nameManufacturer = nameManufacturer;
        this.yearRelease = yearRelease;
        this.engine = engine;
        System.out.println("Название автомобиля: " + name);
        System.out.println("Название производителя: " + nameManufacturer);
        System.out.println("Год выпуска: " + yearRelease);
        System.out.println("Объем двиателя: " + engine + " см3");
        System.out.println("\n");
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }
    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }
    public String getNameManufacturer() {
        return nameManufacturer;
    }
    public int getYearRelease() {
        return yearRelease;
    }
    public double getEngine() {
        return engine;
    }
}
