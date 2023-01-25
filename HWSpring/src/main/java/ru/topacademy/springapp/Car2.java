package ru.topacademy.springapp;

import java.util.List;

public class Car2 {
    private Auto auto;

    private List<Auto> carList;
    private int price;
    private String brend;
    private String name;
    private int markup;

    public Car2(List<Auto> carList) {
        this.carList = carList;
    }

    public List<Auto> getCarList() {
        return carList;
    }

    public void setCarList(List<Auto> carList) {
        this.carList = carList;
    }

    public Car2() {
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarkup() {
        return markup;
    }

    public void setMarkup(int markup) {
        this.markup = markup;
    }

    public String ShowCar() {
        StringBuilder stringBuilder = new StringBuilder(500);
        stringBuilder.append("=====CAR#2=====\n" + "Brend: " + brend + "\n" + "Name: " + name + "\n" + "Price: " + price + "\n" + "Markup: " + markup + "\n");
        if (carList!=null && carList.size()>0){ stringBuilder.append("\n"); }
        for (Auto a:this.carList) {
            stringBuilder.append(a.Assembly() + "\n");
        }
        return stringBuilder.toString();
    }
}
