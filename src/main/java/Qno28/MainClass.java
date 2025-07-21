/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno28;

/**
 *
 * @author gaurav
 */
public class MainClass {

    public static void main(String[] args) {
        Swapper test = new Swapper(5, 4);
        System.out.println("Before swapping:");
        System.out.println("X = " + test.getX() + " Y = " + test.getY());
        test.swap();
        System.out.println("After swapping:");
        System.out.println("X = " + test.getX() + " Y = " + test.getY());
    }
}
