package com.judell.playground.javadoc;

/**
 * I am a java doc
 */
public class JavDoc {

    /**
     * Java doc
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This is a java doc");
        hello("Justin!!!");
    }

    /**
     * This method takes in a string param and says hello plus
     * what ever you pass into the method
     */
    public static void hello(String string){
        System.out.println("Hello " + string);
    }
}
