package ru.topacademy.springapp;

public class Wheel implements Auto {
    private int diameter;
    private int weight;
    private int price;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
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

    public Wheel() {
    }

    public Wheel(int diameter, int weight, int price) {
        this.diameter = diameter;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Diameter: " + this.diameter + " sm\n" + "Weight: " + this.weight + " kg\n" + "Price: " + this.price + " rub\n";
    }

    @Override
    public String Assembly() {
        StringBuilder stringBuilder = new StringBuilder(500);
        int count=1;
        for (int i=0; i<4;i++){
            stringBuilder.append("Wheel#"+ count++ + "\n" + toString() + "\n");
        }
        return "---WHEELS---\n" + stringBuilder.toString()  +"\n";
    }
}
