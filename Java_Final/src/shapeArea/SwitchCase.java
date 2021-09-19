package shapeArea;

import java.util.Scanner;
import java.util.*;
import java.*;

public class SwitchCase {
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("1. Area of a Square");
		System.out.println("2. Area of a Rectangle");
		System.out.println("3. Area of a Circle");
		System.out.println("\nEner your choice");
		
		}
		catch (Exception e) {
			System.out.println("invalid entry");
		}
	
		
		switch(s.nextInt())
		
		{
		case 1:
			System.out.println("Enter side length");
			double sd = s.nextDouble();
			sd*=sd;
			System.out.println("Area of the Square is: "+ sd);
			
		break;
		
		case 2:
			System.out.println("Enter length of rectangle");
			double l=s.nextDouble();
			System.out.println("Enter width of rectangle");
			double w=s.nextDouble();
			System.out.println("The area of the rectangle is: " + l*w);
			
		break;
		
		case 3:
			System.out.println("Enter the radius of the Circle");
			double rad = s.nextDouble();
			double ar=Math.PI*rad*rad;
			System.out.println("Area of the circle is: " + ar);
			
		break;
		
		default:System.out.println("Invalid Choice");
		
		
		
		}
		 s.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
