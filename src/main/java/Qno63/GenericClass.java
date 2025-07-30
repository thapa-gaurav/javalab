/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno63;

/**
 *
 * @author gaurav
 * @param <T>
 * @param <V>
 */
public class GenericClass<T> {
    private T variable1;
    
    public GenericClass(T variable1){
        this.variable1 = variable1;
    }
    
    public T getVar(){
        return this.variable1;
    }
    
    public void showTypes(){
        System.out.println("Type of T is : " + this.variable1.getClass().getName());
    }
    
}
