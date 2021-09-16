package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableRxample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("���̵� ��й�ȣ�Է�");
			System.out.print("���̵�: ");
			String id = scanner.nextLine();//�Է��� ������ ���ڿ��� ��ȯ�Ѵ�.
			
			System.out.println("��й�ȣ :");
			String password = scanner.nextLine();
			System.out.println();
		
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� ����");
					break;
				}else {
					System.out.println("����");
				}
	
			}else {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
		}
	}
}

