package demo2;

public class Car {

	private String color;
	private String engineType;
	
	public Car(String colorOfCar, String typeOfEngine) {
		color = colorOfCar;
		engineType = typeOfEngine;
	}
	
	public void printCarInfo() {
		System.out.println("Color of car =  " + color);
		System.out.println("Type of engine = " + engineType);
	}
	
	public static void main(String[] args) {
		//Class object = new Class();
		Car mercedes = new Car("Silver", "Petrol");
		Car audi = new Car("Black", "Diesel");
		
		//object.method();
		audi.printCarInfo();
		mercedes.printCarInfo();
	}
}
