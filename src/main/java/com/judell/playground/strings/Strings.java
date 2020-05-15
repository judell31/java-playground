package com.judell.playground.strings;

public class Strings {

    public static void main(String[] args) {
        String ch = "t";
        String test = "test";
        String[] strArray = {"test", "me", "and", "you"};

        System.out.println(ch.charAt(0) == test.charAt(0));

        System.out.println("String:\tA\n".replace("\t", "\\t").replace("\n","\\n"));
        System.out.println("\\n");
        String x = "e";
        System.out.println(x.contains("e"));
        char c = 10;
        System.out.println("d\n".charAt(1) == c);

        int count = 0;
        for (int i = 0; i < strArray.length; i++){
            count++;
        }
        System.out.println(count);
    }
}
