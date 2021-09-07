package sec07.exam04_other_constructor_call;

public class Car {
	//클래스의 구성 멤버
	//1.필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	//2.생성자
	////
	
	/* 
	 * 생성자 오버로딩
	 * this: 자기자신의 객체를 의미한다.
	 * this(): 자기자신의 객체의 다른 생성자를 의미한다.
	 * super:부모객체
	 * super(): 부모 객체의 생성자 
	 */
	
	Car() {
		
	}
	
	
	Car(String model) {
		this(model, null, 0);
	}

	Car(String model, String color){
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	//3.메소드
	
	
}
