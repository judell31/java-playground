package com.judell.playground.prohibited_chars;

import java.util.ArrayList;

public class ProhibitedChars {

    public static void main(String[] args) throws Exception{
        ArrayList<Character> prohibitedCharsList = new ArrayList<>();
        String correctInput = "Judell";
        String incorrectInput = "Judell!";

        char c = 0;
        for (int i = 0; i < 128; i++){
            c++;
            if (!Character.isLetter(c) && c != 39){
                prohibitedCharsList.add(c);
            }
        }

        System.out.println("Valid Input");
        System.out.println(correctInput);
        for (int i = 0; i < correctInput.length(); i++){
            for (int p = 0; p < prohibitedCharsList.size(); p++){
                if (correctInput.charAt(i) == prohibitedCharsList.get(p)){
                    System.out.println("String " + correctInput + " contains illegal character(s): " + correctInput.charAt(i));
                    throw new Exception("You have entered an illegal character");
                }
            }
        }

        System.out.println("\nInvalid Input");
        for (int i = 0; i < incorrectInput.length(); i++){
            for (int p = 0; p < prohibitedCharsList.size(); p++){
                if (incorrectInput.charAt(i) == prohibitedCharsList.get(p)){
                    System.out.println("String " + incorrectInput + " contains illegal character(s): " + incorrectInput.charAt(i));
                    throw new Exception("You have entered an illegal character");
                }
            }
        }
    }
}