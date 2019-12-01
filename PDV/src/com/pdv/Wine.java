package com.pdv;

import java.util.Random;

public class Wine extends Porez{
	
	private String naziv;
	private double osnovnaCjena;
	private long barcode;
	public Wine(String naziv, double osnovnaCijena) {
		this.setNaziv(naziv);
		this.osnovnaCjena = osnovnaCijena;
	}

	@Override
	public double RacunajPorez() {		
		return   ((osnovnaCjena * stopaPDV / 100) + osnovnaCjena) * (porez / 100) + (osnovnaCjena * stopaPDV / 100) + osnovnaCjena;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Osnovna cijena je " + osnovnaCjena + " s PDV je " + RacunajPorez() + " barcod " + BarCode();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getOsnovanCjena() {
		return osnovnaCjena;
	}
	public void setOsnovanCjena(double osnovanCjena) {
		this.osnovnaCjena = osnovanCjena;
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
