package com.company;

public class Main {

    public static void main(String[] args) {
        Vozilo car = new Vozilo();

        car.setMarkaTip("WV Golf");
        car.setBrSasije("VWZZZ123456");
        car.setBrMotora("CK123");
        car.setSnagaMotora((byte) 45);
        car.setGorivi("dizel");
        car.setGodinaProizvodnje((byte) 1995);

        Vozac vozac = new Vozac();

        vozac.setIme("Osman");
        vozac.setBrPutnika((byte) 5);


        System.out.println(car);
        System.out.println(vozac);


    }
}
