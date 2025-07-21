/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno24;

/**
 *
 * @author gaurav
 */
public class AreaMethodOverload {

    public int area(int l) {
        return l * l;
    }

    public int area(int l, int b) {
        return l * b;
    }

    public double area(double r) {
        return Math.PI * r * r;
    }
}
