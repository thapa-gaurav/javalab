/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno5051;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaurav
 */
public class Qno50 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 101, 50000.0));
        employees.add(new Employee("Jane Smith", 102, 60000.0));
        employees.add(new Employee("Bob Johnson", 103, 55000.0));

        String filename = "employees.ser";

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            
            oos.writeObject(employees);
            System.out.println("Objects written to file successfully!");

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

      
    }
}


