package sec03.exam02_hashcode;

import java.util.HashMap;

import sec03.exam01_equals.Member;

public class KeyExample {
	public static void main(String[] args) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		
	
		
		//�ĺ�Ű "new Key(1)" �� "ȫ�浿"�� �о��
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}


