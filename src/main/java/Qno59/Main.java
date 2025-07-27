/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Qno59;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaurav
 */
public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setVar("java Intro", 56.5);
        Book book2 = new Book();
        book2.setVar("C++ Intro", 55.5);
        Book book3 = new Book();
        book2.setVar("C Intro", 67.5);
        Book book4 = new Book();
        book4.setVar("Java Advance", 69.5);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println("Displaying book starting with java.");
        for (Book book : books) {
            if (book.getTile().toUpperCase().startsWith("JAVA")) {
                book.showVar();
            }
        }
    }
}
