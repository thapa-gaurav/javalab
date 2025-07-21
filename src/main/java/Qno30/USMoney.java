/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno30;

/**
 *
 * @author gaurav
 */
public class USMoney {

    private int dollars;
    private int cents;

    public USMoney(int dollars, int cents) {
        
        this.cents = cents % 100;
        this.dollars = dollars + cents/100;
    }

    public USMoney plus(USMoney obj){
        return new USMoney(this.dollars + obj.dollars, this.cents + obj.cents);
    }
    
    
    @Override
    public String toString(){
        return "Dollar: " + this.dollars + " Cent: " + this.cents;
    }
}
