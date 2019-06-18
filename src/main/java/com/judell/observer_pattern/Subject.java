package com.judell.observer_pattern;

public interface Subject {

    void register(Observer o);

    void unregister(Observer o);

//    void notifyObserver();

    String  notifyObserverUser();

    String notifyObserverUsers();
}
