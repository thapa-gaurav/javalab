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
public class Qno17 {
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:\t");
        int first = input.nextInt();
        System.out.print("Enter the second number:\t");
        int second = input.nextInt();
        System.out.println("x power y using recursive is : " + power(first,second));
        
        
    }
    public static int power(int first,int second){
        if(second == 1) return first;
        else return first * power(first,second - 1);
    }
}
