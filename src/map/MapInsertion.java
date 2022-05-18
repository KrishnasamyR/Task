package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapInsertion {

	Scanner scanner = new Scanner(System.in);

	public void showHashMap() {

		System.out.println("Enter the Count of Elements: ");

		int elements = scanner.nextInt();
		
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		for(int count=0; count <scanner.nextInt(); count++) {
			Integer a=scanner.nextInt();
			String b=scanner.next();
			hashMap.put(a, b);
			System.out.println(hashMap.put(a,b));
		}
		

		/*for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		System.out.println("Elements are sorted on HashSet :" + hashMap);*/
	}

	public void showLinkedHashMap() {
		
		System.out.println("Enter the Count of Elements: ");

		int elements = scanner.nextInt();
		
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		for (int count = 0; count < elements; count++) {

			System.out.println("Enter the Elements: ");

			linkedHashMap.put(scanner.nextInt(), scanner.next());

			System.out.println("Elements are sorted on Linked Hash Set :" + linkedHashMap);
		}
	}

	public void showTreeMap() {
		
		System.out.println("Enter the Count of Elements: ");

		int elements = scanner.nextInt();

		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();

		for (int count = 0; count < elements; count++) {

			System.out.println("Enter the Elements: ");

			treeMap.put(scanner.nextInt(),scanner.next());

			System.out.println("Elements are sorted on ascending order :" + treeMap);

		}
	}
}
