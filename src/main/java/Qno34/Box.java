/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno34;

/**
 *
 * @author gaurav
 */
public class Box {
       private int length;
    private int height;
    private int breadth;

    public Box(int length, int height, int breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    public int getVolume(){
        return this.length * this.breadth * this.height;
    }
    
}
