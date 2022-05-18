package map;
import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap <Integer,String> studentName = new HashMap <Integer,String>();
		studentName.put(1,"krishna");
		studentName.put(2, "samy");
		System.out.println("Student List: " + studentName);
		
		Map <Integer,String> dummyName = new HashMap <Integer,String>();
		dummyName.putAll(studentName);
		System.out.println("Dummy Name: " + dummyName);
		System.out.println("Clone name: " + studentName.clone());
		dummyName.clear();
		
	}

}
