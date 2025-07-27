/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno58;

/**
 *
 * @author gaurav
 */
public class Student {
    private int roll;
    private String name;
    
    public Student(String name,int roll){
        this.roll = roll;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getRoll(){
        return this.roll;
    }
    
    public String toString(){
        return "Name = " + this.getName() + " Roll No = " + this.getRoll();
    }
}
