package com.cybage;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		double base;
		double height;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		height = sc.nextInt();
		System.out.println("Enter base");
		base = sc.nextInt();
		//		area of triangle formula
		double areaOfTriangle = (0.5 * (base * height));
		System.out.println("Area of triangle is "+ areaOfTriangle);
	}
}
