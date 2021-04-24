package com.judell.playground.user_id;

import java.util.UUID;

public class UserId {

    /**
     * Takes a UUID and grab the first part of it and returns it as a string
     */
    public static void main(String[] args) {
        String[] uuid = UUID.randomUUID().toString().split("-");

        for (int i = 0; i < 10; i++) {
            System.out.println(uuid[0]);
        }
    }
}
