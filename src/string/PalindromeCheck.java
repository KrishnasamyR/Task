package string;

import java.util.Scanner;

public class PalindromeCheck {

	public void checkPalindrome() {
		int number, value, remain = 0, reverse = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scan.nextInt();
		scan.close();
		 value= number;
		while (value > 0) { //121
			remain = value % 10;//1/12/121/
			reverse = (reverse * 10) + remain;//1/12/123
			value = value / 10;//12/1/0
		}
		if (number == reverse) {
			System.out.println("Entered the input is Palindrome");
		} else {
			System.out.println("Entered the input is Not palindrome Number");
		}
	}
}