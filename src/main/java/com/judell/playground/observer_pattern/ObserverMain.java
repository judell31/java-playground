package com.judell.playground.observer_pattern;

public class ObserverMain {
    public static Subject radio = new Station();

//    public static Observer user1 = new Person("judell");
//    public static Observer user2 = new Person("wes");
//    public static Observer user3 = new Person("Jay");

    public static void main(String[] args) {
        new Registrants().x();
        new Registrants().y();

        //        Subject radio = new Station();
//
//        Observer ob1 = new Person("Jay");
//        Observer ob2 = new Person("James");
//        Observer ob3 = new Person("Jack");
//        Observer ob4 = new Person("nero");
//
//        radio.notifyObserver();
//
//        radio.register(ob1);
//        radio.register(ob2);
//
//        radio.notifyObserver();
//
//        radio.register(ob3);
//        ((Station) radio).updateGoldenNum(100);
//
//        radio.unregister(ob1);
//        radio.unregister(ob2);
//
//        radio.register(ob4);
//
//        ((Station) radio).updateGoldenNum(10);

    }
}

