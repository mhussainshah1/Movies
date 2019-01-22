package com.company;

import java.util.*;

/**
 * Create an application which will prompt the user to enter the name of their favorite Movie. Add the Movie to an
 * array list.  Use a loop to continue adding movies to the array until the user presses q or Q.
 *
 * Once the user presses Q then print the list of movies before exiting the program.
 *
 * HINT: You can use the .toLowerCase() method of the String class to convert the 'Q' to 'q'. So if your response is
 * stored in a variable called userAnswer then userAnswer.toLowerCase() will evaluate to a 'q'. Alternatively, you can
 * use the userAnswer.equalsIgnoreCase("q") method.
 *
 * BONUS: Print out the list of movies sorted in alphabetical order.
 *
 * BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.
 */
public class Main {

    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String movie;

        while (true) {
            System.out.print("Enter the name of their favorite Movie: ");
            movie = keyboard.nextLine().toLowerCase();
            if (movie.equals("q")){
                break;
            } else {
                movies.add(movie);
            }
        }

        //Sort
        Collections.sort(movies);
        for (String m:movies) {
            System.out.print(m + ", ");
        }
        System.out.println();

        //Random
        int length = movies.size();
        int index = (int) Math.random() * length;
        System.out.println(movies.get(index));
    }
}
