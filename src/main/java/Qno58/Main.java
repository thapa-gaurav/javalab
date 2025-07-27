/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno58;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gaurav
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Sorting data using name of student");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Gaurav Thapa", 1));
        students.add(new Student("Suresh Rijal", 2));
        students.add(new Student("Prasoon Dhital", 3));
        students.add(new Student("Sahil Adhikari", 4));

        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new SortByName());
        System.out.println("After Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
