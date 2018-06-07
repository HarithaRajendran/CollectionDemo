package SetDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	static void mapDemo(Map map1) {
		
		map1.put(1, "Archana");
		map1.put(2, "Ramya");

		System.out.println(map1);
		
		Set<Integer> set1 = map1.keySet();
		for(Integer s:set1) {
			System.out.println(s+","+ map1.get(s));
		}
		System.out.println("------------------------");
		Set<Map.Entry<Integer, String>> m = map1.entrySet();
		
		for(Map.Entry<Integer, String> d:m) {
			d.setValue("sandy");
			System.out.println(d.getKey()+","+d.getValue());
			
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();
		mapDemo(map1);
	}
}
