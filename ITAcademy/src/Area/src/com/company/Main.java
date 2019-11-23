package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		Rectangle rectangle = new Rectangle(1,10,1,10,1,1,5,5);

		System.out.println(rectangle.claculateSurface());
		System.out.println(rectangle.toString());

		Square square = new Square(0.0,10,0,10,0,0,10,10);

		System.out.println(square.claculateSurface());
		System.out.println(square.toString());

	        }
}
