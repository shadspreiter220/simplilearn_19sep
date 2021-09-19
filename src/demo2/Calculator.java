package demo2;

public class Calculator {
	
	
	 void add(int a, int b) { 
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		
		obj.add(10, 20); 
	}

}
