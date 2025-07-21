/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno34;

/**
 *
 * @author gaurav
 */
public class Shipment extends BoxWeight {
    private int cost;
    
    public Shipment(int length, int height, int breadth, int weight, int cost){
        super(length, height, breadth, weight);
        this.cost = cost;
    }
    
    public int getCost(){
        return this.cost;
    }
}
