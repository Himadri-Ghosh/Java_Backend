package com.practice.constructors2;

class Person {

    String name;
    int age;

    // Parent class constructor
    Person(String _name, int _age) {
        this.name = _name;
        this.age = _age;

        System.out.println("Person constructor called");
    }
}

class Student extends Person {

    String course;

    // Child class constructor
    Student(String name, int age, String course) {

        // Calling parent class constructor
        super(name, age);

        this.course = course;

        System.out.println("Student constructor called");
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }
}

public class School {

    public static void main(String[] args) {

        Student student1 = new Student("Himadri", 24, "Java Backend");

        student1.display();
    }
}
