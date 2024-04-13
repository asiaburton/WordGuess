package com.github.zipcodewilmington;
import javax.xml.stream.events.Characters;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class WordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] wordlist = {"cheese", "run", "dance", "play"};
        int randomNum = random.nextInt(wordlist.length);
        String secretWord = wordlist[randomNum];
        char[] guess = new char[secretWord.toCharArray().length];
        char[] solution = secretWord.toCharArray();
        int triesAllowed = secretWord.toCharArray().length;
        int tries = 0;
        int triesRemaining = triesAllowed;

        System.out.println("Let's Play Wordguess version 1.0! " +
                "\nTry to guess the secret word by entering each letter... \n" +
                "Current Guesses: ");

        // check condition to begin game
        while ((tries < triesAllowed) && (!(guess == solution))) {
            // initialize each letter in guessed array to _
            for (int i = 0; i < solution.length; i++) {
                guess[i] = '_';
            }

            for (int j = 0; j < solution.length; j++) {
                for (char c : guess) {
                    System.out.print(c);
                }
                System.out.println("\nEnter a single character or type - to exit ");
                char letter = scanner.next().charAt(0);

                // guessed char == '-' exit game.
                if (letter == '-') {
                    System.out.println("Goodbye for now!");
                    break;

                } else {
                    for (int k = 0; k < solution.length; k++) {
                        if (solution[k] == letter) {
                            guess[k] = letter;
                            tries++;
                            triesRemaining = (triesAllowed - tries);

                        } else {
                            tries++;
                            triesRemaining = (triesAllowed - tries);
                        }

                        }
                    }

                    System.out.println("You have " + triesRemaining + " tries left.");
                }

//                if ((new solution.contains(letter))) {
//                    // place correct guessed letter into guessed char array at correct index
//                    int correctGuess = new String(solution).indexOf(letter);
//                    letter = String.valueOf(guess[correctGuess]);
//                    tries++;
//                    System.out.println("You have " + triesRemaining + " tries left.");
//                } else if
//                    // guessed char is not in solution, line does not change
//                (!(new String(solution).contains(letter))) {
//                    tries++;
//                    System.out.println("You have " + triesRemaining + " tries left.");
//
//
//
//
//                 //System.out.println(guess);
//                //System.out.println(solution);
//

            }
        }

    }













