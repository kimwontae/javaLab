package sec02.exam01_arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ȫ�浿 ", "�ſ��", "���ڹ�");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);  //auto Boxing ==> heap�� ����
		for(int value : list2) {
			System.out.println(value);
		}

	}

}
