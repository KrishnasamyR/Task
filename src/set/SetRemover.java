package set;

import java.util.TreeSet;

public class SetRemover {

	void remover() {

		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Apple");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Ball");
		System.out.println("After remove values :" + treeSet.remove("Apple"));
		System.out.println(treeSet);
	}

	void removerAll() {

		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Apple");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Ball");
		System.out.println("After remove all values :" + treeSet.removeAll(treeSet));
		System.out.println(treeSet);
	}

	void headSetRemover() {

		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Apple");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Ball");

		System.out.println("Values lesser than given value" + treeSet.headSet("Cat"));
	}

	void tailSetRemover() {

		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Apple");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Ball");
		System.out.println("Values equal to and higher than given value" + treeSet.tailSet("Cat"));
	}

	void SubSetRemover() {

		TreeSet<String> treeSet = new TreeSet<String>();

		treeSet.add("Apple");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Ball");
		System.out.println("Subset values :" + treeSet.subSet("Apple", "Dog"));
	}

	void pollFirst() {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(50);
		System.out.println("PollFirst :" + treeSet.pollFirst());

	}

	void pollLast() {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(50);
		System.out.println("PollLast :" + treeSet.pollLast());

	}

}