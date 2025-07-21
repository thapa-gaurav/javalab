/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno35;

/**
 *
 * @author gaurav
 */
public class Rectangle extends Figure{
    
    public Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    
    public double getArea(){
        return this.dim1 * this.dim2;
    }
}
