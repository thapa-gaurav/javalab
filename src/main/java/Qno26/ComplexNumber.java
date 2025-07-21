/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno26;

/**
 *
 * @author gaurav
 */
public class ComplexNumber {

    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public double getImag() {
        return this.imag;
    }
    
    public ComplexNumber sum(ComplexNumber obj){
        return new ComplexNumber(this.real + obj.real , this.imag + obj.imag);
    }
}
