/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno34;

/**
 *
 * @author gaurav
 */
public class BoxWeight extends Box {
    private int weight;
    
    public BoxWeight(int length, int height, int breadth, int weight){
        super(length,height,breadth);
        this.weight =  weight;
    }
    
    public int getWeight(){
        return this.weight;
    }
}
