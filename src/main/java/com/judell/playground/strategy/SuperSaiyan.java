package com.judell.playground.strategy;

public class SuperSaiyan implements SaiyanStrategy {

    @Override
    public void transform() {
        System.out.println("Goku transformed into a Super Saiyan");
    }
}
