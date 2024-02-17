package fsd.bacics.Recursive;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int t1 =0 , t2 =1;
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();		
		while(t1<=a) {
		System.out.print(t1 +",");
		int sum = t1+t2;
		t1=t2;
		t2=sum;
		
		
		}

	}

}
