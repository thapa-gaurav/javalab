/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno5051;

import java.io.Serializable;

/**
 *
 * @author gaurav
 */
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }
}
