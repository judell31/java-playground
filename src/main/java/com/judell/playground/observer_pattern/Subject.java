package com.judell.playground.observer_pattern;

public interface Subject {

    void register(Observer o);

    void unregister(Observer o);

//    void notifyObserver();

    void notifyObserverUser();

    void notifyObserverUsers();
}
