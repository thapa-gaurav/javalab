/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno25;

/**
 *
 * @author gaurav
 */
public class Number {
    private int first;
    private int second;
    private int third;
    
    public Number(int first, int second,int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public int getMax(){
        if(first>second){
            if(first> third){
                return first;
            }else{
                return third;
            }
        }else{
            if(second>third){
                return second;
            }else{
                return third;
            }
        }
    }
}

