/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno59;

/**
 *
 * @author gaurav
 */
public class Book {
    private String tile;
    private double price;
    
    public void setVar(String tile, double price){
        this.price = price;
        this.tile = tile;
    }
    public String getTile(){
        return this.tile;
    }
    public double getPrice(){
        return this.price;
    }
    
    public String showVar(){
        return "title : " + this.tile + " Price: " + this.price; 
    }
}
