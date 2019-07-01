package com.judell.lab;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random handler = new Random();
        int handlerNum = handler.nextInt(200);

        System.out.println(handlerNum);
    }
}
