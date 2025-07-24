/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author gaurav
 */
public class Qno52 {
       public static void main(String[] args) {
        String filePath = "languages.dat";

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            writeFixedString(raf, "Java", 10);
            writeFixedString(raf, "Python", 10);
            writeFixedString(raf, "C++", 10);

            raf.seek(10);
            String second = readFixedString(raf, 10);
            System.out.println("Second language: " + second.trim());

            raf.seek(10);
            writeFixedString(raf, "Go", 10);

            raf.seek(0);
            System.out.println("\nAll values after overwrite:");
            for (int i = 0; i < 3; i++) {
                System.out.println(readFixedString(raf, 10).trim());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void writeFixedString(RandomAccessFile raf, String str, int length) throws IOException {
        StringBuilder builder = new StringBuilder(str);
        while (builder.length() < length) {
            builder.append(" ");
        }
        raf.writeBytes(builder.toString());
    }

    static String readFixedString(RandomAccessFile raf, int length) throws IOException {
        byte[] bytes = new byte[length];
        raf.readFully(bytes);
        return new String(bytes);
    }
}
