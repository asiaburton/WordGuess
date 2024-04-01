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
        Integer randomNum = random.nextInt(wordlist.length);
        String secretWord = wordlist[randomNum];
        char[] guess = new char[secretWord.length()];
        char[] solution = secretWord.toCharArray();
        int triesAllowed = secretWord.length();
        int tries = 0;
        int triesRemaining = triesAllowed - tries;

        System.out.println("Let's Play Wordguess version 1.0! " +
                "\nTry to guess the secret word by entering each letter... \n " +
                "Current Guesses: " + triesAllowed);


        while ((tries < triesAllowed) && (!(guess == solution))) {
            for (int i = 0; i < guess.length; i++) {
                guess[i] = '_';
                System.out.println(guess);
                System.out.println("Enter a single character: ");
                String letter = scanner.next();


                if ((new String(solution).contains(letter))) {
                    // place correct guessed letter into guessed char array at correct index
                    int correctGuess = new String(solution).indexOf(letter);
                    letter = String.valueOf(guess[correctGuess]);
                    tries++;
                    System.out.println("You have " + triesRemaining + " tries left.");
                } else if
                    // guessed char is not in solution, line does not change
                (!(new String(solution).contains(letter))) {
                    tries++;
                    System.out.println("You have " + triesRemaining + " tries left.");

                } else if
                    // guessed char == '-' exit game.
                (letter.equals('-')) {
                    System.out.println("Goodbye for now!");
                    break;
                }


                 //System.out.println(guess);
                //System.out.println(solution);


            }
        }

        }
    }











