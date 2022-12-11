package ru.top.oop.models;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static <TreeSetSet> void main(String[] args) {
        TreeSet<Student> treeSet1 = new TreeSet<>(new NameUpComparator());
        treeSet1.add(new Student("Igor","Ivanov",11));
        treeSet1.add(new Student("Oleg","Popov",10));
        treeSet1.add(new Student("Dmitr","Nikonov",12));
        treeSet1.add(new Student("Nikolai","Feodorov",12));
        treeSet1.add(new Student("Sergei","Leonov",8));
        for (Student student : treeSet1){
           System.out.println(student);
       }

        System.out.println("\n");

        TreeSet<Student> treeSet2 = new TreeSet<>(new NameDownComparator());
        treeSet2.add(new Student("Igor","Ivanov",11));
        treeSet2.add(new Student("Oleg","Popov",10));
        treeSet2.add(new Student("Dmitr","Nikonov",12));
        treeSet2.add(new Student("Nikolai","Feodorov",12));
        treeSet2.add(new Student("Sergei","Leonov",8));
        for (Student student : treeSet2){
            System.out.println(student);
        }

        System.out.println("\n");

        TreeSet<Student> treeSet3 = new TreeSet<>(new SurnameUpComparator());
        treeSet3.add(new Student("Igor","Ivanov",11));
        treeSet3.add(new Student("Oleg","Popov",10));
        treeSet3.add(new Student("Dmitr","Nikonov",12));
        treeSet3.add(new Student("Nikolai","Feodorov",12));
        treeSet3.add(new Student("Sergei","Leonov",8));
        for (Student student : treeSet3){
            System.out.println(student);
        }

        System.out.println("\n");

        TreeSet<Student> treeSet4 = new TreeSet<>(new SurnameDownComparator());
        treeSet4.add(new Student("Igor","Ivanov",11));
        treeSet4.add(new Student("Oleg","Popov",10));
        treeSet4.add(new Student("Dmitr","Nikonov",12));
        treeSet4.add(new Student("Nikolai","Feodorov",12));
        treeSet4.add(new Student("Sergei","Leonov",8));
        for (Student student : treeSet4){
            System.out.println(student);
        }
    }
}
