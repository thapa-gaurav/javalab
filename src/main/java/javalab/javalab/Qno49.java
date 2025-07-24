/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author gaurav
 */
public class Qno49 {
    public static void main(String[] args) {
        String filePath = "sample.txt"; 
        
        try (FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println("Reading file using byte stream:");
            
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
