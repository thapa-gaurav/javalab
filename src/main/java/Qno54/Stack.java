/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno54;

/**
 *
 * @author gaurav
 */
public class Stack {

    private int[] arrayStack;
    private int position;

    public Stack(int length) {
        if(length <= 0){
            throw new IllegalArgumentException("Stack size must be greater than 0.");
        }
        this.arrayStack = new int[length];
        this.position = -1;
    }

    public boolean isEmpty() {
        return this.position == -1;
    }

    public boolean isFull() {
        return this.position == this.arrayStack.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        } else {
            this.arrayStack[++position] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack empty.");
        } else {
            int value = this.arrayStack[position--];
            return value;
        }
    }
}
