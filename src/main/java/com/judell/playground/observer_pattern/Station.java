package com.judell.playground.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Station implements Subject{

    private List<Observer> myObserver = new ArrayList<>();

//    private int goldenNum = 2;
    private String spResp = "this is a msg for user 1";
//    private String spResp2 = "this is for user 2";
    private String spResp3 = "this is for all other users";

    @Override
    public synchronized void register(Observer o) {
        myObserver.add(o);
    }

    @Override
    public synchronized void unregister(Observer o) {
        myObserver.remove(o);
    }

    @Override
    public void notifyObserverUser() {
//        myObserver.stream().forEach(
//                (Observer o) -> o.notifyUser(spResp)
//        );
//        return spResp;

        for (var o : myObserver){
            o.notifyUser(spResp);
        }
    }

    @Override
    public void notifyObserverUsers() {
//        myObserver.stream().forEach(
//                (Observer o) -> o.notifyUser(spResp3)
//        );
//        return spResp3;

        for (var o : myObserver){
            o.notifyUser(spResp3);
        }
    }

//    @Override
//    public void notifyObserver() {
//        myObserver.stream().forEach(
//                (Observer o) -> o.notifyMe(goldenNum)
//        );
//    }

//    public void updateGoldenNum(int i){
//        this.goldenNum = i;
//        notifyObserver();
//    }
}
