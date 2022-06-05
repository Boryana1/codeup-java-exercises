package movies;

import util.Input;

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
    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input == 1){
            System.out.println(MoviesArray.findAll());
        }


    }
}
