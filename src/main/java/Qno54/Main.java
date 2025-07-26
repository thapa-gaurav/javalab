/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno54;

/**
 *
 * @author gaurav
 */
public class Main {

    public static void main(String[] args) {
      try{
                  Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
      }catch(IllegalStateException e){
          System.out.println("Error: " + e.getMessage());
      }

    }
}
