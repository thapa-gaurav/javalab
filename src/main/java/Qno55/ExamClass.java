/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno55;

/**
 *
 * @author gaurav
 */
public class ExamClass implements Exam {
    private String division;
    private int mark;
    
    @Override
    public void setExam(String division, int mark){
        this.division = division;
        this.mark = mark;
    }
    
    @Override
    public void getExam(){
        System.out.println("Division = " + this.division +" Mark = " + this.mark);
    }
    
}
