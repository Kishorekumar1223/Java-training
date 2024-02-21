package sorting;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) 
	{
		int i=0,  j=0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	
		while(i<n && j<n) 
		{
			if(i==0 || j==0)
			{
				System.out.print("*");
			}
			else if(i==n-1|| j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
				i++;j++;
			}
			System.out.println();
		}
		}
}