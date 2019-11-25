package com.company;

public class Firma {
    private Radnik[] radnici;
    private double marza;

    public Firma(double marza, int kap){
        this.marza = marza;
        radnici = new Radnik[kap];
    }

    public boolean Zaposli(Radnik r){
        int i = 0;
        while (i < radnici.length && radnici[i] != null)
            i++;
        if(i == radnici.length)
            return false;
        radnici[i] = r;
        return true;
    }

    public boolean Otpusti(int i){
        if (i<0 || i>radnici.length || radnici[i] == null)
            return false;
        radnici[i] = null;
        return true;
    }

    public double Dobit(){
        double ukPrihod = 0, ukPlata = 0;
        for (int i = 0; i < radnici.length ; i++) {
            if (radnici[i] != null){
                if (radnici[i] instanceof Prodavac)
                    ukPrihod += radnici[i].prihod();
                ukPlata += radnici[i].plata();
            }

        }
        return ukPrihod * marza / 100 - ukPlata;
    }

    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < radnici.length ; i++) {
            if (radnici[i] != null){
                s += radnici[i] + "\n";
            }
        }
        return s + " Dobit firme: " + Dobit();
    }

}
