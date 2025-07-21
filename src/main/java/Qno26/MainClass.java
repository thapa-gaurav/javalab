/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno26;

/**
 *
 * @author gaurav
 */
public class MainClass {

    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(5, 6);
        ComplexNumber second = new ComplexNumber(11, 12);
        ComplexNumber sum = first.sum(second);
        System.out.println("The sum of two complex numbers are: " + sum.getReal() + " " + sum.getImag() + "i");
    }
}
