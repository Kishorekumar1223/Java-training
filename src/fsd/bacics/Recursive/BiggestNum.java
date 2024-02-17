package fsd.bacics.Recursive;

import java.util.Scanner;

public class BiggestNum {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the first number:");
	int x = scanner.nextInt();
	System.out.print("Enter the second number:");
	int y = scanner.nextInt();
	System.out.print("Enter the third number:");
	int z = scanner.nextInt();
	if(x>y && x >z) {
		System.out.println("Largest number is:"+ x);
	}else if (y>z) {
		System.out.println("Largest number is:"+ y);
	}else {
		System.out.println("Largest number is:"+z);
	}
	}

}
