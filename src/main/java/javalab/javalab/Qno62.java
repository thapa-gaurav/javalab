/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab.javalab;

/**
 *
 * @author gaurav
 */
public class Qno62 {
    public static void main(String[] args) {
        System.out.println("Demonstrating inner class.");
        Outer out = new Outer(55);
        out.test();
    }
}

class Outer {

    private int outerVar;

    public Outer(int varr) {
        this.outerVar = varr;
    }

    public void test() {
        Inner in = new Inner();
        in.printer();
    }

    class Inner {

        void printer() {
            System.out.println("Outer variable value is : " + outerVar);
        }
    }
}
