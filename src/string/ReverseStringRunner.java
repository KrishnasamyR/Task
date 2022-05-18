package string;

import java.util.Scanner;

public class ReverseStringRunner {
    
    public static void main (String args[])
    {
        ReverseString reverseString = new ReverseString();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str =scanner.nextLine();
        scanner.close();
        
        System.out.println("Original String :"+str);
    String reverseStr = reverseString.reverseRecursively(str);
        System.out.println("Reverse String using Recursion :"+reverseStr);
        
    }

}