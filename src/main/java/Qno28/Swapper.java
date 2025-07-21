/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno28;

/**
 *
 * @author gaurav
 */
public class Swapper {

    private int x;
    private int y;

    public Swapper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void swap() {
        int temp = this.x;
        this.x = this.y;
        this.y = temp;
    }

}
