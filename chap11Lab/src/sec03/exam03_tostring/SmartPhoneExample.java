package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		SmartPhone yourPhone = new SmartPhone("애플", "IOS");
		
		String strObj1 = yourPhone.toString();
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
		System.out.println(strObj1);
	}
}
