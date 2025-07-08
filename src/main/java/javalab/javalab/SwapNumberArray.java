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
public class SwapNumberArray {
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[4];
        System.out.println("Enter the number one by one:");
        for(int i = 0; i < number.length; i++)
            number[i] = in.nextInt();
        
        System.out.println("Before swapping:");
        for(int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        
        System.out.println("Enter the postion of first number to swap:");
        int firstPostion = in.nextInt();
        System.out.println("Enter the positon of second number to swap");
        int secondPostion = in.nextInt();
        
        
        int temp = number[firstPostion];
        number[firstPostion] = number[secondPostion];
        number[secondPostion] = temp;
        
        System.out.println("After swapping:");
        for(int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
        
    }
}
