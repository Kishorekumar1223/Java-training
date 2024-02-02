package fsd.bacics.control;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 1;
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your num : ");
		int a = scanner.nextInt();
		for(i=1;i<=a;i++)
		{
			b=b*i;		
		}
		System.out.println(b);
	}

}
