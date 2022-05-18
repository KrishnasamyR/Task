package string;
import java.util.Scanner;
 public class StringDemo
{
  public static void main (String args[])
  {
   String a;
   String stringTwo="krishna"; 
   System.out.print("\nEnter The String:");
   Scanner in = new Scanner(System.in);
   a=in.nextLine();
   System.out.print("\nOriginal String   :"+a);
   System.out.print("\nLower Case        :"+a.toLowerCase());
   System.out.print("\nUpper Case        :"+a.toUpperCase());
   System.out.print("\nReplace           :"+a.replace('a','u'));
   System.out.print("\nTrim              :"+stringTwo.trim());
   System.out.print("\nEquals            :"+a.equals(stringTwo));
   System.out.print("\nNo Case Equals    :"+a.equalsIgnoreCase(stringTwo));
   System.out.print("\nLength		     :"+a.length());
   System.out.print("\nCharAt		     :"+a.charAt(2));
   System.out.print("\nCompare	         :"+a.compareTo(stringTwo));
   System.out.print("\nConcat	         :"+a.concat(stringTwo));
   System.out.print("\nSubstring 	     :"+a.substring(2));
   System.out.print("\nSubstring 	     :"+a.substring(0,2));
  }
}