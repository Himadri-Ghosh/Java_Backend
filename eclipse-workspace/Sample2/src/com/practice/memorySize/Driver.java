package com.practice.memorySize;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        int count = 0;

        while(true) {

            Student student = new Student("Rohit", 17);

            students.add(student);

            count++;

            System.out.println("Objects created: " + count);
        }
    }
}