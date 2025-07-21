/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno35;

/**
 *
 * @author gaurav
 */
public abstract class Figure {
    double dim1;
    double dim2;
     public  Figure(double dim1, double dim2){
         this.dim1 = dim1;
         this.dim2 = dim2;
     }
     abstract double getArea();
}
