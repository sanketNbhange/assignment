package alluser;

import java.util.Scanner;

import utility.Calc;

public class User1 {

	public static void main(String[] args) {
		
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find square root");
		num = sc.nextDouble();
		Calc cal = new Calc();
		//find root method call		
		double squareRoot = cal.findRoot(num);
		System.out.println("Square root of the "+squareRoot);
	}
}
