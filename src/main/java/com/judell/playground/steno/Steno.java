package com.judell.playground.steno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Steno {

    public static void main(String[] args) {
        String masterText = "you are not ite";
        String incorrectUserText = "you are not its";

        String[] masterText2 = {"test", "me", "and"};
        String[] incorrectText2 = {"testa", "me", "but"};

        /*
        Takes a string and puts each word into an array of strings
         */
        String[] masterTextArray = masterText.split(" ");
        for (String x : masterTextArray){
            System.out.println(x);
        }

        ArrayList<String> wordArray1 = new ArrayList<>(Arrays.asList(incorrectUserText.split(" ")));
        System.out.println(wordArray1);

        ArrayList<String> wordArray = new ArrayList<>();
        for (String y : incorrectUserText.split(" ")){
            wordArray.add(y);
        }
        System.out.println(wordArray);

        /*
         * Looks at each char in a string and compares them
         * This needs some logic to account for index out of bounds
         */
        System.out.println("\nChecking the letter in each word:");
        for(int i = 0; i < incorrectUserText.length(); i++){
            if (incorrectUserText.charAt(i) != masterText.charAt(i)){
                System.out.println("Looks like you made an error. The correct letter is " + '"' + masterText.charAt(i) + '"' + " You typed " + '"' + incorrectUserText.charAt(i) + '"');
            }
        }

        /*
         * Looks at each index in an array of strings and checks if that index is equal
         * this also needs to account for index out of bounds
         */
        System.out.println("\nChecking if the word matches:");
        for (int i = 0; i < incorrectText2.length; i++){
            if (!incorrectText2[i].equals(masterText2[i])){
                System.out.println("You made an error. The correct word is " + '"' + masterText2[i] + '"' + " You typed " +  '"' + incorrectText2[i] + '"');
            }
        }
    }
}
