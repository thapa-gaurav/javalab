/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno18;

/**
 *
 * @author gaurav
 */
public class Prime {
    private final int initial = 300;
    private final int last = 500;
    
    public void printPrimeNumber(){
        for(int i = initial; i <= last; i++){
            if(isPrime(i)){
                System.out.println("   " + i);
            }
        }
    }
    public boolean isPrime(int number){
        for(int i = 2; i< number/2;i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
