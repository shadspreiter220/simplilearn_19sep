package shapeArea;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		
		 int rl;
		 int rw;
		 int area2;
		 int r;
		 int sd;
		 
		 
	        double pi = 3.14, area;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter radius of circle:");
	        r = s.nextInt();
	        area = pi * r * r;
	        System.out.println("Area of circle:"+area);
	        
	        Scanner s2 = new Scanner(System.in);
	    	System.out.print("Enter side length of square:");
	    	sd = s2.nextInt();
	    	area2 = sd * sd;
	    	System.out.println("Area of square: " + area2);
	    	
	    	int area3;
	    	Scanner s3 = new Scanner(System.in);
	    	System.out.println("Enter rectangle length");
	    	rl = s3.nextInt();
	    	System.out.println("Enter rectangle width");
	    	rw = s3.nextInt();
	    	area3 = rl * rw;
	    	System.out.println("Area of the rectangle: " + area3);
	    	
	        
	       }
	
	
	
	
	

}
