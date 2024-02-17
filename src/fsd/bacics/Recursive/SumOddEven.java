package fsd.bacics.Recursive;

import java.util.Scanner;

public class SumOddEven {

	public static void main(String[] args) {
		int E =0;
		int O =0;
		int sum = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of element in array:");
	int n = scanner.nextInt();
	int []a = new int[n];
	System.out.println("Enter the element of the array:");
	for(int i=0;i<n;i++) {
	    a[i]=scanner.nextInt();
		}
	for(int i =0;i<n;i++) 
	{
		if(a[i]%2==0)
		{
			E = sum + a[i];
			//2
			O =sum +a[i];
		}
	//	sum= O + a[i];
	System.out.println("Sum of EvenNumbers:" + E);
	System.out.println("Sum of OddNumbers:" + O);
}
}}