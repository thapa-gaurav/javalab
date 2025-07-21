/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno30;

/**
 *
 * @author gaurav
 */
public class MainClass {

    public static void main(String[] args) {
        USMoney test = new USMoney(5, 80);
        USMoney test2 = new USMoney(1, 90);
        USMoney test3 = test.plus(test2);
        System.out.println("The sum is: ");
        System.out.println(test3);
    }
}
