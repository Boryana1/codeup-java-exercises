package movies;

import util.Input;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    //What would you like to do?
//
//0 - exit
//1 - view all movies
//2 - view movies in the animated category
//3 - view movies in the drama category
//4 - view movies in the horror category
//5 - view movies in the scifi category
//
//Enter your choice: 1
//
//Frankenstein -- horror
//Goodfellas -- drama
//Pulp Fiction -- drama
//...


    public static void pesho() throws ArrayStoreException {
        throw new ArrayStoreException();
    }

    public static void main(String[] args) {

        pesho();


        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.print("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            Movie[] movies = MoviesArray.findAll();
            if (input == 1) {
                for (int i = 0; i < movies.length; i++) {
                    System.out.println(i + ". Movie name is " + movies[i].getName() + ", the category is: " + movies[i].getCategory() + ";");
                }
            } else if (input == 2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (input == 3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (input == 4) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (input == 5) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName());
                    }
                }
            } else if (input == 0) {
                break;
            }
        }
    }
}