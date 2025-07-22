/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.util.Scanner;

/**
 *
 * @author gaurav
 */
public class Qno41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String first = in.next();
        System.out.println("Enter second string:");
        String second = in.next();
        
        System.out.println("After concatenating the strings:");
        System.out.println(first.concat(second));
    }
}
