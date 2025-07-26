/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno57;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaurav
 */
public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1,"action"));
        movies.add(new Movie(2,"comedy"));
        movies.add(new Movie(3,"slice of life"));

        String filename = "Comedy.dat";
        List<Movie> comedyMovies = new ArrayList<>();
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            for(Movie movie: movies){
                if(movie.getGenre().equalsIgnoreCase("comedy")){
                    comedyMovies.add(movie);
                }
            }
            oos.writeObject(comedyMovies);
            System.out.println("Objects written to file successfully!");

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

      
    }
}
