package ArrayList;
//ArrayList is one of the classes provides implementation for the list (interface).
//duplicate values are allowed
//insertion oder is maintained 
//resizeable
//default capacity 10

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public void arrayList() {
		List <String> arrayList= new ArrayList<String>(); //List Implementation  
		
		arrayList.add("Monday"); //adding elements
		arrayList.add("Tuesday");
		arrayList.add("Monday");
		
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("Monday"));
		System.out.println(arrayList.lastIndexOf("Monday"));
		
		List <String> anotherList= new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println(anotherList);
		
		anotherList.remove(0);
		System.out.println(anotherList);
		
		anotherList.clear();
		System.out.println(anotherList);
	}
	public static void main(String[] args) {
		ArrayListDemo list= new ArrayListDemo();
		list.arrayList();
	}

}