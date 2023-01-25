package ru.topacademy.springapp;

public class Engine implements Auto {
    private int horsePower;
    private double capacity;
    private int weight;
    private int price;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
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

    public Engine() {
    }

    public Engine(int horsePower, double capacity, int weight, int price) {
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Horse Power: " + this.horsePower + " h.p.\n" + "Capacity: " + this.capacity + " l\n" + "Weight: " + this.weight + " kg\n" + "Price: " + this.price + " rub";
    }

    @Override
    public String Assembly() {
        return "---ENGINE---\n" + toString() + "\n";
    }
}
