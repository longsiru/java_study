package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {

	public static void main(String[] args) {
		//Map<> map = new HashMap<>();
		
		//HashMap<key, object>
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("siru", 90);
		map.put("enmei", 80);
		map.put("yan", 90);
		map.put("bin", 80);
		map.put("미미", 85);
		
		System.out.println("총 entry 수: " + map.size());
		
		//key로 값을 얻기
		String key = "siru";
		int value = map.get(key);
		System.out.println("점수: " + value);
		
		//반복해서 키와 값을 얻기 첫번째 방법
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		
		
		//반복해서 키와 값을 얻기 두번째 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) { //다음키가 있는지 찾는다.
			 Entry<String, Integer> entry = entryIterator.next();
			 String k = entry.getKey(); //키를 가져옴
			 Integer v = entry.getValue(); // 값을 가져옴
			 System.out.println(k +":"+v);
		 }
		
	}

}
