/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno57;

import java.io.Serializable;

/**
 *
 * @author gaurav
 */
public class Movie implements Serializable {
    private final int id;
    private final String genre;
    
    public Movie(int id, String genre){
        this.id = id;
        this.genre = genre;
    }
    public int getId(){
        return this.id;
    }
    public String getGenre(){
        return this.genre;
    }
}
