/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

/**
 *
 * @author gaurav
 */
public class Qno39 {

    public static void main(String[] args) {
        System.out.println("Demonstrating multiple catch statement.");
        int a = 0;
        int arr[] = {1, 2, 3};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i] / (i+1));
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
