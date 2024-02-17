package fsd.bacics.Recursive;

import java.util.Scanner;

public class Palindrome {

	public static void main(String input) {
		boolean res = true;
		int length = input.length();
		for (int i =0;i<=length/2;i++) {
		if(input.charAt(i)!= input.charAt(length-i-1)) {
			res = false;
			break;
		}
		}
	System.out.println(input + " is Palindrome ="+res);
	}
	private static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the statement: ");
		String str = sc.nextLine();
		checkPalindrome(str);
		
	}
}
