/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno34;

/**
 *
 * @author gaurav
 */
public class Main {

    public static void main(String[] args) {
        Shipment ship = new Shipment(10, 5, 4, 7, 45
        );
        System.out.println("Volume: " + ship.getVolume() + " cubic units");
        System.out.println("Weight: " + ship.getWeight() + " kg");
        System.out.println("Cost: Rs " + ship.getCost());
    }
}
