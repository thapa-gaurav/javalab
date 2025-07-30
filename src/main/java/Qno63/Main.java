/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno63;

/**
 *
 * @author gaurav
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Showing generic class.");
        GenericClass<String> str = new GenericClass<>("Generic");
        GenericClass<Double> dbl = new GenericClass<>(6.55);
        
        System.out.println("T is : " + str.getVar());
        str.showTypes();
        System.out.println("T is : " + dbl.getVar());
        dbl.showTypes();

    }
}
