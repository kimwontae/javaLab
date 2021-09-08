package sec10.exam01_static_member;

public class Calculator {
	
	
	static double pi = 3.141592; //정적필드 메소드 영역에 생성
	//double pi = 3.141592;  //인스턴스 필드
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}

}
