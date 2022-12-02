package test.ch14.vector;

import java.util.HashMap;
import java.util.Map;


public class HashMapEx {

	public static void main(String[] args) {
		//Map<> map = new HashMap<>();
		
		//HashMap<key, object>
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("siru", 100);
		map.put("enmei", 100);
		map.put("yan", 100);
		map.put("bin", 100);
		
		System.out.println("총 entry 수: " + map.size());
		
		//key로 값을 얻기
		String key = "siru";
		int value = map.get(key);
		System.out.println("점수: " + value);
		
	}

}
