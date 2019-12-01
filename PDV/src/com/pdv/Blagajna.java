package com.pdv;

public class Blagajna {

	public static void main(String[] args) {

		Wine wine = new Wine("Bjelo",100);
		System.out.println(wine.RacunajPorez());
		System.out.println(wine.toString());
		
		Chocolate milka = new Chocolate("Milka",2.5);
		
		System.out.println(milka.RacunajPorez());
		System.out.println(milka.toString());
		
		System.out.println(milka.getBarcode());
		
	}

}
