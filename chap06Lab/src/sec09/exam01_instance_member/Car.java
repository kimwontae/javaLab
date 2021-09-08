package sec09.exam01_instance_member;

public class Car {
	/*
	 * z클래스 구성멤버
	 * 필드
	 * 생성자
	 * 메소드
	 */
	Car(){} //생성자 오버로딩
	
	//필드
	String model;
	int speed;
	//생성자
	Car(String model){
		this.model = model;//자기 객체에 있는 필드(model이다!)
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;  //speed를 파라미터로 받아서 자기 필드에 할당
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i); //인스턴스 메소드
			System.out.println(this.model+"가 달립니다.(시속: "+ this.speed+"km/h)");
		}
	}
	

}
