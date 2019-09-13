package com.judell.strategy;

public class Goku {
    SaiyanStrategy transform;
    String saiyanLevel;

    public Goku(String saiyanLevel){
        this.saiyanLevel = saiyanLevel;
    }

    public void saiaynStrategy(SaiyanStrategy transform){
        this.transform = transform;
    }

    public void transform(){
        System.out.println("Saiyan Level: " + this.saiyanLevel);
        transform.transform();
    }
}
