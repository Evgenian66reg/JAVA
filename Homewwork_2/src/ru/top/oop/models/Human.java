package ru.top.oop.models;

public class Human {
    public String firstName;
    public String lastName;
    public int age;
    public String gender;

    public Human(String firstName,String lastName,int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age + " лет(года)");
        System.out.println("Пол: " + gender);
        System.out.println("\n");
    }

    public void allInfoHuman(String firstName,String lastName,int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age + " лет(года)");
        System.out.println("Пол: " + gender);
        System.out.println("\n");
    }

    public void fullName(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("\n");
    }
}
