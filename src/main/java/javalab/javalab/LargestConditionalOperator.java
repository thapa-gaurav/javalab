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
public class LargestConditionalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[4];
        System.out.println("Enter the number one by one:");
        for(int i = 0; i < number.length; i++)
            number[i] = in.nextInt();
        int largest = number[1];
        for(int i = 0; i < number.length - 2; i++)
        {
            largest = number[i] > number [i+1]? number[i]:number[i+1];
        }
        System.out.println("Largest number is : " + largest);
    }
}
