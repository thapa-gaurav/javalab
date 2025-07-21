/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno31;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author gaurav
 */
public class Main {
    public static void main(String[] args) {
        Person person = new CollegeGraduate("Gaurav Thapa", LocalDate.of(2021,07,21) ,3.9,LocalDate.now());
        System.out.println(person);
    }
}
