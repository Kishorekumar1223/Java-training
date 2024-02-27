package sorting;

import java.util.Scanner;

public class RecurLpattern {

	public static void main(String[] args) 
	{
		int i=0;  
		int j=0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	
		System.out.println("Enter the index i : "+ n);
		kishore(n,i,j);
	}
	public static int kishore(int n,int i,int j) {
		if(i<n)
			{
			if(j<n) 
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
			}
			return kishore(n,i,j+1);
			}
			System.out.println();
			return kishore(n, i+1, j=0);
			}
		return i;
}

}