/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author gaurav
 */
public class Qno48 {

    public static void main(String[] args) {
        String filePath = "sample.txt";
        String[] lines = {
            "first Line", "second Line"
        };

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            System.out.println("Writing to file using byte stream...");

            for (String line : lines) {
                byte[] lineBytes = line.getBytes();
                fos.write(lineBytes);
                fos.write('\n');
            }

            System.out.println("Successfully wrote to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
