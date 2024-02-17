package fsd.bacics.Recursive;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter thr number:");
		int a = scanner.nextInt();
		int factorial = fact(a);
		System.out.println("Factorial of entered number :"+ factorial);
		}

	private static int fact(int n) {
		int output;
		if(n == 1) {
		return 1;
	}
		output = fact(n-1)*n;
		return output;
	}


}
