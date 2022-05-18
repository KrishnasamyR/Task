package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	
	public void showHashSet(){
		
		HashSet<String>hashSet= new HashSet<String>();
		
		hashSet.add("Apple");
		hashSet.add("Apple");
		hashSet.add("Cat");
		hashSet.add("Elephant");
		hashSet.add("Dog");
		hashSet.add("Ball");
		System.out.println("Elements are sorted on HashSet :"+ hashSet);
	}
	
	public void showLinkedHashSet(){
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("Apple");
		linkedHashSet.add("Cat");
		linkedHashSet.add("Elephant");
		linkedHashSet.add("Dog");
		linkedHashSet.add("Ball");
		System.out.println("Elements are sorted on Linked Hash Set :"+ linkedHashSet);
	}
	
	public void showTreeSet(){
		
		TreeSet<String> treeSet= new TreeSet<String>();
		treeSet.add("Apple");
		treeSet.add("Cat");
		treeSet.add("Elephant");
		treeSet.add("Dog");
		treeSet.add("Ball");
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);

	}
}
