package Test;

import java.util.Scanner;

public class Trougao {
	
	public static void main(String[] args) {
		
		double a, b, c, obim;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite a stranicu trougla: ");
		a=input.nextDouble();
		
		System.out.println("Unesite b stranicu trougla: ");
		b=input.nextDouble();
		
		System.out.println("Unesite c stranicu trougla: ");
		c=input.nextDouble();
		
		boolean pom = Ispitaj(a,b,c);
		
		if(pom == true) {
		
		obim = Obim(a,b,c); 
		
		Double povrsina = Povrsina(a,b,c);
		
		ispis(povrsina, obim);
		
		}else
			System.out.println("Vas unos nije tacan!!");
		
		input.close();
	}
	
	public static boolean Ispitaj(double a, double b, double c) {
		if(a > 0 && b > 0 && c >0) {
			return true;
		}else
			return false;
	}
	
	public static double Obim(double a, double b, double c) {
		double obim = a + b + c;
		return obim;
	}
	
	public static Double Povrsina(double a, double b, double c) {
		double obim = a + b + c;
		double s = obim / 2;
		return s * (s-a) * (s-b) * (s-c);
		
	}
	
	public static void ispis(double p , double o) {
		System.out.printf("Povrisina trougla je %f , a obim njegov %f", p, o);
	}

}
