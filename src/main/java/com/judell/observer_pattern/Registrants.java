package com.judell.observer_pattern;

public class Registrants {

    private Subject radio = new Station();

    //Fix me i have bugs
    public void x(){
        var user1 = new Person("judell", "!nero");
        if (user1.resp().equals("!nero"))
        radio.register(user1);
        radio.notifyObserverUser();
    }

    //Fix me i have bugs
    public void y(){
        var user3 = new Person("jay", "!nero");
        if (user3.resp().equals("!nero"))
        radio.register(user3);
        radio.notifyObserverUsers();
    }
}
