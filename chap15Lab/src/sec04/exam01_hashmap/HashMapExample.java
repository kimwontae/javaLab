package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] arg) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//°´Ã¼ÀúÀå
		map.put("½Å¿ë±Ç", 85);
		map.put("È«±æµ¿", 95);
		map.put("µ¿Àå±º", 80);
		map.put("È«±æµ¿", 95);
		
		//System.out.println(map.size());
		
		//System.out.println(map.get("È«±æµ¿"));
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		
		//°³º° °´Ã¼ Ã³¸® ¹æ¹ý
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+", "+ value);
		}
		
		//°³º° °´Ã¼ Ã³¸® ¹æ¹ý2
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
