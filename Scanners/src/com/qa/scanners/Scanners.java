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
	         System.out.println("Sum of the given two numbers: " +
	         Calculator.add(a, b));
	         break;
	         case 's' :
	         System.out.println("Difference between the two numbers: " +
	    	         Calculator.subtract(a, b));
	         break;
	         case 'm' :
	         System.out.println("Product of the two numbers: "+
	    	         Calculator.mult(a, b));
	            case 'd' :
	         try {
	             // ArithmeticException will be thrown because
	             // a number cannot be divided by 0
	        	  System.out.println("Result of the division: "+
	 	    	         Calculator.div(a, b));
	        	  } 
	         	  catch (ArithmeticException e) {
	         		  	System.out.println("Arithmetic Exception: cannot divide by 0");
	        	  }
	         break;
	         default :
	         System.out.println("Invalid input");
	      }
	   }
	}