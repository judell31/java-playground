package com.judell.observer_pattern;

public class Person implements Observer{
    private String name;

    Person(String name){
        this.name = name;
    }

//    @Override
//    public void notifyMe(int i) {
//        System.out.println(name + " got notified" + ". Golden number is: " + i);
//    }

    @Override
    public void notifyUser(String s) {
        System.out.println(name + " got the msg " + s);
    }

}
