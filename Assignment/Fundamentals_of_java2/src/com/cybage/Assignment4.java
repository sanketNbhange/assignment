package com.cybage;

import java.util.Scanner;

//Write a Java program to insert an element (specific position) into an array.
public class Assignment4 {

	public static void main(String[] args) {
		int arraySize;
		Scanner sc = new Scanner(System.in);
		//		array size
		arraySize = sc.nextInt();
		
		int[] arr = new int[arraySize];
		int pos;
		System.out.println("Enter position to insert value in array");
		pos = sc.nextInt();
		int ele;
		//		take the ele to enter
		System.out.println("Enter number you want to insert at position "+pos);
		ele = sc.nextInt();
		arr[pos] = ele;
//		print the number you have entered on given position
		System.out.println("you have entered "+arr[pos]+ " at "+pos+" position");
	}
}
