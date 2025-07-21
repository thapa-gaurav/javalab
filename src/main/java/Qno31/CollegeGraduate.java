/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno31;


import java.time.LocalDate;


/**
 *
 * @author gaurav
 */
public class CollegeGraduate extends Person {
    private double GPA;
    private LocalDate graduationDate;
    
    public CollegeGraduate(String name,LocalDate birthday,double GPA,LocalDate graduationDate){
        super(name,birthday);
        this.GPA = GPA;
        this.graduationDate = graduationDate;
    }
    
    public double getGPA(){
        return this.GPA;
    }
    public LocalDate getGraduation(){
        return this.graduationDate;
    }
    
    public String toString(){
        return "Name: " + this.getName() + " DOB: " + this.getBirthday() + " GPA: " + this.getGPA() + " Graduation date: " + this.getGraduation();
    }
}
