package demo;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		int x = 20;
		double y = 55.554;
		
		//implicit type casting
		double z = x;
		
		System.out.println(z);
		
		//Explicit Type Casting
		String a = "10";
		int b = Integer.parseInt(a);
		System.out.println(b);
		
		int c = (int)y;
		System.out.println(c);
		
	}
		
}

