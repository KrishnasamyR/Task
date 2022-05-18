package string;
import java.util.Scanner;

public class StringPalindromeRunner {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input String :");
        String str = scan.next();
        scan.close();
        
        StringPalindrome palindrome = new StringPalindrome();
        System.out.println("Is given String Palindrome : "+palindrome.checkPalindrome(str));
        

    }

}