package sec03.exam03_tostring;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		SmartPhone yourPhone = new SmartPhone("����", "IOS");
		
		String strObj1 = yourPhone.toString();
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
		System.out.println(strObj1);
	}
}
