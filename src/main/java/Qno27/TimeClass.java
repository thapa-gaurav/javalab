/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno27;

/**
 *
 * @author gaurav
 */
public class TimeClass {

    private int hr;
    private int min;
    private int sec;

    public TimeClass(int hr, int min, int sec) {
        
        this.sec = sec % 60;
        this.min = min % 60 + sec / 60 ;
        this.hr = hr + min / 60 ;
    }

    public TimeClass sum(TimeClass obj) {
        return new TimeClass(this.hr + obj.hr, this.min + obj.min, this.sec + obj.sec);
    }

    @Override
    public String toString() {
        return "Time is :" + this.hr + " hours " + this.min + " minutes " + this.sec + " seconds.";
    }
}
