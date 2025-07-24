/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;


import java.io.FileReader;
import java.io.IOException;
public class Qno45 {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        
        try (FileReader reader = new FileReader(filePath)) {
            System.out.println("Reading character by character:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    } 
}
