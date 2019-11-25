package com.company;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma(30,5);

        Sef osman = new Sef("osman",6,3);
        Prodavac prodavac1 = new Prodavac("Jusuf", 5);
        Prodavac prodavac2 = new Prodavac("Amra",6);

        firma.Zaposli(osman);
        firma.Zaposli(prodavac1);
        firma.Zaposli(prodavac2);

        osman.dodjeli(prodavac1);
        osman.dodjeli(prodavac2);

        prodavac1.prodao(85000);
        prodavac2.prodao(95146);

        System.out.println(firma);

    }
}
