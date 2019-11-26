package com.company;

public class Vozilo {
    private String markaTip;
    private String  brSasije;
    private String brMotora;
    private byte snagaMotora;
    private String gorivi;
    private byte godinaProizvodnje;

    public Vozilo() {
    }

    public String getMarkaTip() {
        return markaTip;
    }

    public void setMarkaTip(String markaTip) {
        this.markaTip = markaTip;
    }

    public String getBrSasije() {
        return brSasije;
    }

    public void setBrSasije(String brSasije) {
        this.brSasije = brSasije;
    }

    public String getBrMotora() {
        return brMotora;
    }

    public void setBrMotora(String brMotora) {
        this.brMotora = brMotora;
    }

    public byte getSnagaMotora() {
        return snagaMotora;
    }

    public void setSnagaMotora(byte snagaMotora) {
        this.snagaMotora = snagaMotora;
    }

    public String getGorivi() {
        return gorivi;
    }

    public void setGorivi(String gorivi) {
        this.gorivi = gorivi;
    }

    public byte getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(byte godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "markaTip='" + markaTip + '\'' +
                ", brSasije='" + brSasije + '\'' +
                ", brMotora='" + brMotora + '\'' +
                ", snagaMotora=" + snagaMotora +
                ", gorivi='" + gorivi + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                '}';
    }
}
