package ru.top.oop.models;


import java.util.Comparator;

public class Student implements Comparator<Student> {
    String name;
    String surname;
    int averageRating;

    public Student(String name, String surname, int averageRating) {
        this.name = name;
        this.surname = surname;
        this.averageRating = averageRating;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAverageRating() {
        return averageRating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageRating=" + averageRating +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

   class NameUpComparator implements Comparator<Student> {
       @Override
       public int compare(Student s1, Student s2) {
           return (s1.name).compareTo(s2.name);
       }
   }

       class NameDownComparator implements Comparator<Student> {
           @Override
           public int compare(Student s1, Student s2) {
               return -(s1.name).compareTo(s2.name);
           }
       }

       class SurnameUpComparator implements Comparator<Student> {
           @Override
           public int compare(Student s1, Student s2) {
               return (s1.surname).compareTo(s2.surname);
           }
       }

       class SurnameDownComparator implements Comparator<Student> {
           @Override
           public int compare(Student s1, Student s2) {
               return -(s1.surname).compareTo(s2.surname);
           }
       }