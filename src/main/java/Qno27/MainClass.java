/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno27;

/**
 *
 * @author gaurav
 */
public class MainClass {

    public static void main(String[] args) {
        TimeClass first = new TimeClass(1, 55, 60);
        TimeClass second = new TimeClass(5, 45, 80);
        TimeClass third = first.sum(second);
        System.out.println("The sum is: ");
        System.out.println(third);

    }
}
