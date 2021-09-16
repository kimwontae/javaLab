package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] arg) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 95);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		
		//System.out.println(map.size());
		
		//System.out.println(map.get("ȫ�浿"));
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		
		//���� ��ü ó�� ���
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+", "+ value);
		}
		
		//���� ��ü ó�� ���2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+", "+ value);
		}
		
		
		
		
	}

}
