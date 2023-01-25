package ru.topacademy.springapp;

public class Transmission implements Auto {
    private int numberGears;
    private String type;
    private int weight;
    private int price;

    public int getNumberGears() {
        return numberGears;
    }

    public void setNumberGears(int numberGears) {
        this.numberGears = numberGears;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Transmission() {
    }

    public Transmission(int numberGears, String type, int weight, int price) {
        this.numberGears = numberGears;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Number Gears: " + this.numberGears + "\n" + "Type: " + this.type + "\n" + "Weight: " + this.weight + " kg\n" + "Price: " + this.price + " rub";
    }

    @Override
    public String Assembly() {
      return "---TRANSMISSION---\n" + toString() + "\n";
    }
}
