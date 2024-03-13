package com.github.zipcodewilmington;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class WordGuess {

 public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
     Random random = new Random();


    String[] wordlist = {"cheese", "run", "dance", "play"};
    Integer randomNum = random.nextInt(wordlist.length);
    String secretWord = wordlist[randomNum];
    this.secretWord = secretWord.toCharArray();


    char[] guess = new char[secretWord.toCharArray().length];
    for(int i = 0; i <secretWord.toCharArray().length; i++) {
        guess[i] = '_';
    }



     }


 }






}
