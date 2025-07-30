/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

/**
 *
 * @author gaurav
 */
public class Qno64 {
        public static void main(String[] args) {
            System.out.println("First Integer");
            Integer[] intArr = {1,2,3,4,5};
            NonGenClass.printArr(intArr);
            System.out.println("Then String");
            String[] strArr = {"str","is","Boring"};
            NonGenClass.printArr(strArr);
    }
}

class NonGenClass{
    public static <T> void printArr(T[] arr){
        for(T a: arr){
            System.out.println(a);
        }
    }
}
