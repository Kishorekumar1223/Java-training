package fsd.bacics.Recursive;

import java.util.Scanner;

public class PatternTri {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i= 1;i<=n-1;i++) {
		for(int j=0;j<=i;j++)
		{
			System.out.print("*"+"");
		}
		System.out.println("");
		for(int i1=n-1;i1>=0;i1--) {
		for(int j=0;j<=i1;j++)
		System.out.print("*"+"");
		}
		System.out.println();
		}
	}
}