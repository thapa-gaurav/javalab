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
public class Person {
    private String name;
    private LocalDate birthday;
    
    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return this.name;
    }
    public LocalDate getBirthday(){
        return this.birthday;
    }
}
