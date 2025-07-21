/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

/**
 *
 * @author gaurav
 */
public class Qno38 {

    public static void main(String[] args) {
        System.out.println("Demonstrating null exception.");
        String test = null;
        try {
            System.out.println(test.chars());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
