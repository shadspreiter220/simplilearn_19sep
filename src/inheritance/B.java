package inheritance;

public class B extends D {

	public void month() {
		System.out.println("It is September");

	}

	public static void main(String[] args) {
		B b = new B();
		b.month();
		b.date();
		b.nextYear();
	}
}
