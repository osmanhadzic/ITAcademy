package Test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int c;
		System.out.println("Unsite brojnik: ");
		int a = in.nextInt();
		System.out.println("Unsite nazivnik: ");
		int b = in.nextInt();
		
		try {
			c = a / b;
			System.out.println("Rezultat je: " + c);
		}catch(Exception e ){
			System.out.println("Nazivnik je nula!!! ");
		}
		
		in.close();

	}

}
