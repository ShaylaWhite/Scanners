package com.qa.scanners;

import java.util.Scanner;

public class Scanners {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		  System.out.println("Enter value of 1st number ::");
	      int a = scanner.nextInt();

	      System.out.println("Enter value of 2nd number ::");
	      int b = scanner.nextInt();
	      
	      
	      System.out.println("Select operation");
	      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
	      char ch = scanner.next().charAt(0);
	      
	      switch(ch) {
	         case 'a' :
	         System.out.println("Sum of the given two numbers: "+(a+b);
	         Calculator.add(a+b);
	         break;
	         case 's' :
	         System.out.println("Difference between the two numbers: "+(a-b));
	         break;
	         case 'm' :
	         System.out.println("Product of the two numbers: "+(a*b));
	         case 'd' :
	         System.out.println("Result of the division: "+(a/b));
	         break;
	         default :
	         System.out.println("Invalid input");
	      }
	   }
	}