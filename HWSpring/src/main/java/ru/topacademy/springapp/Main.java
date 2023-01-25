package ru.topacademy.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applocationContext.xml");

        Car car = context.getBean("car",Car.class);
        Car2 car2 = context.getBean("car2",Car2.class);
        Car3 car3 = context.getBean("car3",Car3.class);
        Car4 car4 = context.getBean("car4",Car4.class);
        System.out.println(car.ShowCar());
        System.out.println(car2.ShowCar());
        System.out.println(car3.ShowCar());
        System.out.println(car4.ShowCar());
        context.close();
    }
}
