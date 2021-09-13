package sec02.exam01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servet/JSP");
		list.add(2,"Database");
		list.add("iBatis");
		
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		
		for(int i=0;i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i +":" +str);
		}
		
	}

}
