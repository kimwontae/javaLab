package sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc; //rc= 변수 
		rc = new Television(); //인터페이스 변수 =TV구현객체;
		rc = new Audio(); //인터페이스 변수 = Audio구현객체;
	}
}
