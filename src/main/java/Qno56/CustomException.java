/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno56;

/**
 *
 * @author gaurav
 */
public class CustomException extends Exception {
    private long no;
   
    public CustomException(long no){
        this.no = no;
        
    }
    
    @Override
    public String getMessage(){
     return this.no + "don't have 10 digits";
    }
}
