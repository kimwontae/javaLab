package sec04.exam01_overriding;

public class Computer extends Calculator {

	@Override   //재정의한다는뜻 생략가능하나 식별가능하도록 작성하는것이 좋다.
	double areaCircle(double r) {  //재정의는 부모 클래스의 메소드이름과 같아야 한다.
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle()실행 ");
		return Math.PI*r*r;
	}
	

}
