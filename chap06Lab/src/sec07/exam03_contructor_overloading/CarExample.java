package sec07.exam03_contructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println("car1.company: "+car1.company);

		Car car2 = new Car("택시", "검정", 200);
		System.out.println("car2.company"+car2.company+"car2.maxSpeed: " +car2.maxSpeed);

	}

}
