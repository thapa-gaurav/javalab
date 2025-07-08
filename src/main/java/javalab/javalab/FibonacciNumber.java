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
public class FibonacciNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth number:");
        int number  = in.nextInt();
        
        System.out.println("Nth fibonacci number is:" + fibonacci(number));
        
    }
    
    public static int fibonacci(int number){
        if(number == 0) return 0;
        else if(number == 1) return 1;
        else return fibonacci(number-1)+fibonacci(number-2);
    }
    
}
