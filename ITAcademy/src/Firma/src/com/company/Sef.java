package com.company;

public class Sef extends Radnik {
    private Radnik[] podredjeni;
    private int brPod = 0;

    public  Sef(String i, double p, int kap) {
        super(i, p);
        podredjeni = new  Radnik[kap];
    }

    public boolean dodjeli(Radnik r){
        if(brPod == podredjeni.length){
            return false;
        }
        podredjeni[brPod++] = r;
        return true;
    }

    @Override
    public double prihod() {
        double p = 0;
        for (int i = 0; i < brPod; p+=podredjeni[i++].prihod());
        return p;
    }
}
