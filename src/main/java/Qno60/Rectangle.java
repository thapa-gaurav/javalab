/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno60;

/**
 *
 * @author gaurav
 */
public class Rectangle implements Shape{
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){
        this.breadth = breadth;
        this.length = length;
    }
    
    public double area(){
        return this.breadth * this.length;
    }
    public double perimeter(){
        return 2 * (this.breadth + this.length);
    }
}
