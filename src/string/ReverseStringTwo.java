package string;

public class ReverseStringTwo {
	public static void main(String[] args) {
		
	
	String str= "abcd";
	String reverse= "";
	int length= str.length();
	
	for(int index=length-1;index>=0;index--) {
		reverse=reverse+str.charAt(index);
		
	}
	System.out.println("Reversed string is: "+reverse);
	
	//StringBuffer buffer=new StringBuffer(str);
	//System.out.println(buffer.reverse());
		
  }
}
