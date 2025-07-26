/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno55;

import java.util.Scanner;

/**
 *
 * @author gaurav
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the division name:");
        String division = in.next();
        System.out.println("Enter the mark of the division:");
        int mark = in.nextInt();
        ExamClass test = new ExamClass();
        test.setExam(division, mark);
        test.getExam();
    }
}
