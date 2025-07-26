/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno56;

/**
 *
 * @author gaurav
 */
public class Mobile {

    private String type;
    private long phone_no;

    public Mobile(String type, long phone_no) throws CustomException{
        if (Mobile.countDigitsUsingLoop(phone_no) != 10) {
            throw new CustomException(phone_no);
        } else {
            this.phone_no = phone_no;
            this.type = type;

        }
    }

    public String toString() {
        return "Type: " + this.type + " Phone No: " + this.phone_no;
    }

    public static int countDigitsUsingLoop(long number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

}
