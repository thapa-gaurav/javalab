/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gaurav
 */
/*A non-empty array A of length n is called on array of all possibilities if it contains all
numbers between 0 and A.length-1 inclusive. Write a method named is All Possibilities
that accepts an integer array and returns 1 if the array is an array of all possiblities,
otherwise it returns 0.*/
public class Qno22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lenght of the array(>0).");
        int n = in.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the element of the array one by one.");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Checking: ");
        if(allPossibilities(A,n) == 1){
            System.out.println("All the numbers are in the given array.");
        }else{
            System.out.println("Not all the numbers are in array.");
        }
    }

    public static int allPossibilities(int A[], int length) {
        if(A == null || A.length == 0) return 0;
        int returnFlag = 1;
        for (int j = 0; j < length; j++) {
            int innerFlag = 0;
            for (int i = 0; i < length; i++) {
                if (A[i] == j) {
                    innerFlag = 1;
                    break;
                }
            }
            if (innerFlag == 0) {
                returnFlag = 0;
                break;
            }
        }
        return returnFlag;
    }

}
