/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gaurav
 */
public class Qno46 {
     public static void main(String[] args) {
        String filePath = "sample.txt";
        String toWrite = "This is also test.";
        
        try (FileWriter writer = new FileWriter(filePath)) {
            System.out.println("Writing character by character:");
            writer.append(toWrite);
            System.out.println("Wrote successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    } 
}
