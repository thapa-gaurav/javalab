/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno33;

/**
 *
 * @author gaurav
 */
public class Room {
    private int length;
    private int breadth;
    
    public Room(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public int getArea(){
        return this.breadth * this.length;
    }
}
