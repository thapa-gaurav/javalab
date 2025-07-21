/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno32;

/**
 *
 * @author gaurav
 */
public class Box {

    private int widht;
    private int height;
    private int depth;

    public Box(int widht, int height, int depth) {
        this.widht = widht;
        this.height = height;
        this.depth = depth;
    }

    public int getArea() {
        return this.widht * this.height;
    }
    
    public int getVolume(){
        return this.getArea() * this.depth;
    }
}
