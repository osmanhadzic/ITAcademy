package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 is for rectangle: ");
		System.out.println("2 is for square: ");
		System.out.println("3 is for circle: ");
		int input = in.nextInt();
		switch (input) {
			case 1:
			       Rectangle rectangle = new Rectangle(1, 10, 1, 10, 1, 1, 5, 5);
			       System.out.println(rectangle.claculateSurface());
			       System.out.println(rectangle.toString());
			break;

			case 2:
				   Square square = new Square(0.0, 10, 0, 10, 0, 0, 10, 10);
			       System.out.println(square.claculateSurface());
			       System.out.println(square.toString());
			break;

			case 3:
			       Shape circle = new Circle(0, 0, 5, 5);
			       System.out.println(circle.claculateSurface());
			       System.out.println(circle.toString());
			break;
		}

	        }
}
