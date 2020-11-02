package com.cybage;

public class Assignment5 {

	static int num1;
	static int num2;
	static void setNumber(int num, int num3) {
		num1 = num;
		num2 = num3;
	}
	
	
	static void display()
	{
		System.out.println("first Number "+num1+ " second number "+num2);
	}
	public static void main(String[] args) {
		setNumber(12, 10);
		//display the data
		display();
		
	}
}
