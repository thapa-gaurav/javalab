/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno56;

import java.util.Scanner;

/**
 *
 * @author gaurav
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the type: ");
        String type = in.next();
        System.out.println("Enter phone number;");
        long no = in.nextLong();
        
        try{
            Mobile mob = new Mobile(type,no);
            System.out.println(mob);
        }catch(CustomException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
