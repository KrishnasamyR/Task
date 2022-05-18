package set;

import java.util.Scanner;
import java.util.TreeSet;

public class SetRemoverScanner {

	Scanner scanner = new Scanner(System.in);

	void remover() {

		try {
			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<String> treeSet = new TreeSet<String>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.next());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("After remove values :" + treeSet.remove(scanner.next()));

			System.out.println(treeSet);

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}

	void removerAll() {

		try {

			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<String> treeSet = new TreeSet<String>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.next());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("After remove all values :" + treeSet.removeAll(treeSet));

			System.out.println(treeSet);

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}

	void headSetRemover() {

		try {

			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<String> treeSet = new TreeSet<String>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.next());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("Values lesser than given value" + treeSet.headSet(scanner.next()));

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}

	void treeSetRemover() {

		try {

			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<String> treeSet = new TreeSet<String>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.next());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("Values equal to and higher than given value" + treeSet.tailSet(scanner.next()));

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}

	void SubSetRemover() {
		try {

			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<String> treeSet = new TreeSet<String>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.next());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("Subset values :" + treeSet.subSet("Apple", "Dog"));

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}

	void pollFirst() {
		try {

			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<Integer> treeSet = new TreeSet<Integer>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.nextInt());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("PollFirst :" + treeSet.pollFirst());

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}

	void pollLast() {

		try {

			System.out.println("Enter the Count of Elements: ");

			int elements = scanner.nextInt();

			TreeSet<Integer> treeSet = new TreeSet<Integer>();

			for (int count = 0; count < elements; count++) {

				System.out.println("Enter the Elements: ");

				treeSet.add(scanner.nextInt());
			}

			System.out.println("Enter the data to remove : ");

			System.out.println("PollLast :" + treeSet.pollLast());

		} catch (Exception exception) {

			System.out.println("Input Mismatch Exception : " + exception);
		}

	}
}