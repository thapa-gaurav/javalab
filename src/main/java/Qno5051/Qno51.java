/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno5051;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author gaurav
 */
public class Qno51 {
     public static void main(String[] args) {
        String filename = "employees.ser";

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            
            System.out.println("Reading objects from file...");

            List<Employee> employees = (List<Employee>) ois.readObject();

            System.out.println("\nEmployees retrieved:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
