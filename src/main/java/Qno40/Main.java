/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno40;

/**
 *
 * @author gaurav
 */
public class Main {

    public static void main(String[] args) {
         try{
             compute(1);
             compute(20);
         }catch(MyException e){
             System.out.println("Caught " + e);
         }
    }

    public static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal exit");
    }
}
