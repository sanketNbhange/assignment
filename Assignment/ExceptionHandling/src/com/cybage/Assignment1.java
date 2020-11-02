package com.cybage;

//Write a program to demonstrate the use of try, catch, finally throw and throws keywords and
//demonstrate the following points in the program.
//a) Multiple catch blocks.
//b) try-catch-finally combination.
//c) try-finally combination.
//d) Exception propagation among many methods.
//e) Use of getMessage(), printStackTrace() function of Throwable class.
//f) Nested try blocks

public class Assignment1 {
	
	// a. multiple catch block	
	public static void main(String[] args) {
		
		try {
			double b = 10/0;
		} catch (NullPointerException e) {
			System.out.println("arithmetatic "+e.getLocalizedMessage());
		}catch (ArithmeticException e) {
			System.out.println("exception "+e);
		} // b.try-carch-finally combination
		finally {
			System.out.println("This is finally block"); //this block will execute any how even after unexpected termination of program
		}
		//c.try finally combination
		try {
			System.out.println("try with finally.");
		}finally {
			System.out.println("try bloc kwork without catch when we include finally!");
		}
		//d) Exception propagation among many methods.
		Assignment1 assignment1 = new Assignment1();
			try {
				assignment1.callDiveVyZero();
			}catch (ArithmeticException e) {
				//e) Use of getMessage(), printStackTrace() function of Throwable class.
				System.out.println(e.getMessage());
				e.printStackTrace();
//				System.out.println(e.getLocalizedMessage());
			}
			
			try {
				String str = null;
				System.out.println("String length"+str.length());
				try {
					double b = 10/0;
				}catch (ArithmeticException e) {
					System.out.println("divide by zero"+e.getLocalizedMessage());
				}
			}catch (NullPointerException e) {
				System.out.println("null pointer "+e.getLocalizedMessage());
			}
	}
	
	// d) Exception propagation among many methods.
	void divideByZero()
	{
		double b = 10/0;
	}
	
	void callDiveVyZero()
	{
		divideByZero();
	}
}
