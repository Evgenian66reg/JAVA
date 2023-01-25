package ru.topacademy.springapp;

public class Body implements Auto  {
    private String type;
    private int weight;
    private int price;

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Body() {
    }

    public Body(String type, int weight, int price) {
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + "\n" + "Weight: " + this.weight + " kg\n" + "Price: " + this.price + " rub";
    }

    @Override
    public String Assembly() {
        return "---BODY---\n" + toString() + "\n";
    }
}
