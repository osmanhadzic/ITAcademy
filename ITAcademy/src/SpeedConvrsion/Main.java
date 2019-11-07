package SpeedConvrsion;

import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mile,km;
		int pom;
		
		System.out.println("For km/h to mil/h press 1  For mil/h to km/h press 2 ");
		
		pom = in.nextInt();
		
		switch(pom) {
		
		case 1:
			System.out.println("Please insert your speed in km/h: ");
		    km = in.nextDouble();
			mile = Converter.ToMilPerH(km);
			System.out.printf("Speed is %.2f mil/h", mile);

			break;
		case 2:
			System.out.println("Please insert your speed in mil/h: ");
		    mile = in.nextDouble();
			km = Converter.ToKmPerH(mile);
			System.out.printf("Speed is %.2f km/h", km);
			break;
			
		
		}
		
		in.close();

	}

}
