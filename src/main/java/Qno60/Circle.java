/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno60;

/**
 *
 * @author gaurav
 */
public class Circle implements Shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2 * this.radius * Math.PI;
    }
}
