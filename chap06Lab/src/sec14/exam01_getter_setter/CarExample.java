package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car mycar = new Car();
		
		mycar.speed2=-5;
		//mycar.speed2=-5;
		mycar.setSpeed(-5);
		
		System.out.println("현재속도: "+mycar.getSpeed());
		System.out.println("현재속도: "+mycar.speed2);

	}

}
