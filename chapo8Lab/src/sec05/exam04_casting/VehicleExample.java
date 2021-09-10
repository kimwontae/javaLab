package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus(); //bus구현객체, 자동형변
		
	vehicle.run();
	Bus bus =(Bus) vehicle; //강제형변
	bus.run();
	bus.checkFare();

	}

}
