/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno33;

/**
 *
 * @author gaurav
 */
public class MyRoom extends Room{
    private int height;
    
    public MyRoom(int lenght,int breadth,int height){
        super(lenght,breadth);
        this.height = height;
    }
    
    public int getVolume(){
        return this.getArea() * this.height;
    }
}
