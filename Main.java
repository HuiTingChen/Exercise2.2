package AirTransportProperties;

public class Main {
	public static void main(String[] args) {
		AirTransport airplane = new AirTransport(); //create new object from class Phone name as vivo
		AirTransport helicopter = new AirTransport();//create seccond object from class Phone name as huawei
		AirTransport privatejet = new AirTransport();
		AirTransport hotairballoon = new AirTransport();
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("AIRPLANE PROPERTIES");
		System.out.println("--------------------------------------------------------------------");
		airplane.printProperties("American Airlines", "Airbus","A321",185);
		System.out.println();
		airplane.printSpec(5450, 7400, 876, 300);
		airplane.calcuTravelHour(7400, 876);
		airplane.calcuFuelConsump(4,2885);	
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("HELICOPTER PROPERTIES");
		System.out.println("--------------------------------------------------------------------");
		helicopter.printProperties("-", "Boeing", "CH-47 Chinook", 55);
		System.out.println();
		helicopter.printSpec(60, 740, 302, 240);
		helicopter.calcuTravelHour(740, 302);
		helicopter.calcuFuelConsump(2,2324);
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("PRIVATE JET PROPERTIES");
		System.out.println("--------------------------------------------------------------------");
		privatejet.printProperties("-", "Airbus", "A318 Elite", 18);
		System.out.println();
		privatejet.printSpec(2245, 6100, 870, 50);
		privatejet.calcuTravelHour(6100, 870);
		privatejet.calcuFuelConsump(6,1245);
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("HOT AIR BALLOON PROPERTIES");
		System.out.println("--------------------------------------------------------------------");
		hotairballoon.printProperties("-", "Cameron Balloons", "N-500", 27);
		System.out.println();
		hotairballoon.printSpec(1960, 12, 310, 16);
		hotairballoon.calcuTravelHour(12, 310);
		hotairballoon.calcuFuelConsump(0.3,113);
	}
}
