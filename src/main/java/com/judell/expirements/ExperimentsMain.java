package com.judell.expirements;

public class ExperimentsMain {

    public static void main(String[] args) {
        System.out.println(userType(1));
    }

    public static String userType(Integer num){
        if(num == 1){
            return "user";
        }
        else if (num == 2){
            return "content creator";
        }
        return "yup";
    }
}
