/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

/**
 *
 * @author gaurav
 */
public class Qno37 {

    public static void main(String[] args) {
        System.out.println("Demonstrating array index bound exception.");
        int A[] = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print(A[i] + " ");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("");
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
