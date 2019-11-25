package com.company;

public class Prodavac extends Radnik {
    private double prihod;

    protected Prodavac(String i, double p) {
        super(i, p);
    }

    public void prodao(double vrijednost){
        prihod += vrijednost;
    }

    @Override
    public double prihod() {
        return prihod;
    }
}
