/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

import java.util.Random;

/**
 *
 * @author gaurav
 */
public class Qno53 {
    public static void main(String[] args) {
        System.out.println("Generating Random between 1 to 100.");
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println(rand.nextInt(100));
        }
    }
}
