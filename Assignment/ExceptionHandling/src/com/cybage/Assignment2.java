package com.cybage;

import java.util.Scanner;

//Create a NegativeNumberException to be thrown by the method
//findSqrRoot() if user enters a negative number.
public class Assignment2 {

	public static void main(String[] args) throws NegativeNumberException {
		double num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to calculate square root..");
		num = sc.nextDouble();
		
		try {
			if(num < 0)
			{
				throw new NegativeNumberException("provided number is negative please provide positive integer");
			}
			else {
			double sqrtnum = Math.sqrt(num);
			System.out.println("square root of "+num+" is "+sqrtnum);
			}
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
