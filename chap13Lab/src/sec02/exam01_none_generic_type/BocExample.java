package sec02.exam01_none_generic_type;

public class BocExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("ȫ�浿");  //object = "ȫ�浿" ==> �ڵ�����ȯ��(�θ���<==�ڽ���)
		String name = (String)box.get(); //���� ����ȯ(�ڽ��� <== �θ���)
		
		box.set(new Apple());//object =new apple ==>�ڵ�����ȯ (�θ���<==�ڽ���)
		Apple apple =(Apple) box.get();
		

	}

}
