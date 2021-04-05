package AirTransportProperties;

public class AirTransport {
	String airlineBrand, ManuFac, model;
	int capacity, distance, range, accelerate, decelerate, fuelConsump;
	double hours;
	 
	void printProperties(String b, String f, String m, int c) {
		System.out.println("AirlineBrand\t: " + b);
		System.out.println("Manufactored\t: " + f);
		System.out.println("Model\t\t: " + m);
		System.out.println("Capacity\t: " + c + "people");

	}
	
	void printSpec(int l, int r, int a, int d) {
		System.out.println("This air transport needs around " + l + "ft of distance for landing.");
		System.out.println("The maximum flying range of this air transport is " + r + "km.");
		System.out.println("This air transport is able to accelerate until " + a + "km/h.");
		System.out.println("This air transport can decelerate until around " + d + "km/h in the air.");

	
	}
	
	void calcuTravelHour (int r, int a) {
		System.out.println("Total travel hours when in maximum speed: " + r/a + "h");
	}
	
	void calcuFuelConsump (double h, int fc) {
		System.out.println("Total fuel consumption (if travel " + h + "hours) : " + h*fc + "litre/h");
	}
	
}
