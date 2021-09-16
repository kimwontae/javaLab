package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		//�������̽����� =new ����Ŭ����();
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servet.JSP");
		set.add("Java");
		set.add("iBatis");
		
		int size=set.size();
		System.out.println("�Ѱ�ü��: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		System.out.println();
		
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("����ִ�.");
		}
		
		
		

	}

}
