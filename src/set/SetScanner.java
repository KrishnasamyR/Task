package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SetScanner {

	Scanner scanner = new Scanner(System.in);

	public void showHashSet() {
		
		try {

		System.out.println("Enter the Count of Elements: ");

		int elements = scanner.nextInt();

		HashSet<String> hashSet = new HashSet<String>();

		for (int count = 0; count < elements; count++) {

			System.out.println("Enter the Elements: ");

			hashSet.add(scanner.next());
		}

		System.out.println("Elements are sorted on HashSet :" + hashSet);
		
		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}
	}

	public void showLinkedHashSet() {
		
		try {
		
		System.out.println("Enter the Count of Elements: ");

		int elements = scanner.nextInt();
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		for (int count = 0; count < elements; count++) {

			System.out.println("Enter the Elements: ");

			linkedHashSet.add(scanner.next());

			System.out.println("Elements are sorted on Linked Hash Set :" + linkedHashSet);
		}
		
		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}
	}

	public void showTreeSet() {
		
		try {
		
		System.out.println("Enter the Count of Elements: ");

		int elements = scanner.nextInt();

		TreeSet<String> treeSet = new TreeSet<String>();

		for (int count = 0; count < elements; count++) {

			System.out.println("Enter the Elements: ");

			treeSet.add(scanner.next());

			System.out.println("Elements are sorted on ascending order :" + treeSet);

		}
		
		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}
	}
}
