package map;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	void hashMap() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Apple");
		map.put(2, "Cat");
		map.put(4, "Dog");
		map.put(1, "Ball");
		map.put(5, "Egg");
		map.put(null, null);
		
		System.out.println("Hash Map Insertion:" + map);

	}

	void linkedHashMap() {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(3, "Apple");
		map.put(2, "Cat");
		map.put(4, "Dog");
		map.put(1, "Ball");
		map.put(5, "Egg");
		map.put(null, null);
		
		System.out.println("Linked Hash Map Insertion:" + map);
		
	}

	void treeMap() {
		try {
			TreeMap<Integer, String> map = new TreeMap<Integer, String>();

			map.put(3, "Apple");
			map.put(2, "Cat");
			map.put(4, "Dog");
			map.put(1, "Ball");
			map.put(5, "Egg");
			// map.put(null, null);

			for (Entry<Integer, String> iterate : map.entrySet()) {
				System.out.println(iterate.getKey() + "  " + iterate.getValue());
			}

			System.out.println("Descending Values : ");

			NavigableMap<Integer, String> reverse = map.descendingMap();
			System.out.println(reverse);
			
			System.out.println(map.containsValue("Dog")); //This method returns true if some value equal to the value exists within the map, else return false.
			
			System.out.println(map.keySet()); //It returns the Set view containing all the keys.
			
			System.out.println(map.get(1));
			
			System.out.println(map.isEmpty());
			
			TreeMap<Integer, String> mapTwo = new TreeMap<Integer, String>();
			mapTwo.putAll(map);
			
			System.out.println("Dummy" + mapTwo);
			
			System.out.println("Clone name: " + mapTwo.clone());
			
			map.clear(); //It is used to reset the map.
			
			System.out.println("Tree Hash Map Insertion:" + map);
			
			System.out.println(map.remove(null, null));
	
			
		} catch (Exception exception) {
			System.out.println("NullPointerException: Null value not allowed in treeMap ");
		}

	}
}







//TreeMap<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
		//System.out.println(map);

		/*ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());

		for (int value = keys.size() - 1; value >= 0; value--) {
			System.out.println(map.get(keys.get(value)));
		}*/