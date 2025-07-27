/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno60;

/**
 *
 * @author gaurav
 */
public class Sample {
    public static void main(String[] args) {
        Shape circle = new Circle(4.5);
        Shape rect = new Rectangle(55.5,44);
        System.out.println("Area of Rectangle: " + rect.area() + " Perimeter of Rectangle : " + rect.perimeter());
        System.out.println("Area of Circle: " + circle.area() + " Perimeter of Circle : " + circle.perimeter());
        
    }
    
}
