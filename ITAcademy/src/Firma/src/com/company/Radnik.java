package com.company;

public abstract class Radnik {
    private String ime;
    private double procenat;

    protected Radnik(String i, double p){
        ime = i;
        procenat = p;
    }

    public abstract double prihod();

    public final double plata(){
        return prihod() * procenat / 100;
    }


}
