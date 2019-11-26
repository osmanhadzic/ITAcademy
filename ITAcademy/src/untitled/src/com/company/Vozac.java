package com.company;

public class Vozac {

    private String ime;
    private byte brPutnika;

    public Vozac() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public byte getBrPutnika() {
        return brPutnika;
    }

    public void setBrPutnika(byte brPutnika) {
        this.brPutnika = brPutnika;
    }

    @Override
    public String toString() {
        return "Vozac{" +
                "ime='" + ime + '\'' +
                ", brPutnika=" + brPutnika +
                '}';
    }
}
