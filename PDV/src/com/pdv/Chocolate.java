package com.pdv;

import java.util.Random;

public class Chocolate extends Porez {
	
	private String naziv;
	private double osnovanCjena;
	private long barcode;
	public Chocolate(String naziv, double osnovnaCijena) {
		this.naziv = naziv;
		this.osnovanCjena = osnovnaCijena;
	}
	
	
	@Override
	public double RacunajPorez() {
		
		return (osnovanCjena * stopaPDV / 100) + osnovanCjena;
	}
	@Override
	public String toString() {
		
		return "Osnovna cijena je " + osnovanCjena + " s PDV je " + RacunajPorez() + " barcode " + BarCode();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getOsnovanCjena() {
		return osnovanCjena;
	}
	public void setOsnovanCjena(double osnovanCjena) {
		this.osnovanCjena = osnovanCjena;
	}


	@Override
	public long BarCode() {
		Random rn = new Random();
		long code = rn.nextInt(9000)+1000;
		barcode = code;
		return code;
	}


	public long getBarcode() {

		return barcode;
	}
	
	

}
