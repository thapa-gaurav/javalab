/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno40;

/**
 *
 * @author gaurav
 */
public class MyException extends Exception {

    private int data;

    public MyException(int data) {
        this.data = data;
    }

    public String toString() {
        return "Custom Error Caught [" + this.data + "]";
    }
}
