/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno58;

import java.util.Comparator;

/**
 *
 * @author gaurav
 */
public class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getName().compareTo(b.getName());
    }
}
