package exceptionHandling;

public class ThrowDemo {
	public static void main(String[] args) {
		String day = "Monday";
		
		if(day.equals("Monday")) {
			throw new ArithmeticException();
			
		}
		else {
			System.out.println("It's a good day");
		}
	}

}
