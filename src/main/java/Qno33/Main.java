/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno33;

/**
 *
 * @author gaurav
 */
public class Main {
    public static void main(String[] args) {
        MyRoom first = new MyRoom(3,4,5);
        MyRoom second = new MyRoom(6,7,8);
        
        System.out.println("Area of first = " + first.getArea() + " second = " + second.getArea());
        System.out.println("Volume of first = " + first.getVolume() + " second = " + second.getVolume());

    }
}
