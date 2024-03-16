package treeTraversal;

import java.util.Scanner;

public class TaskPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(i ==0 && j==n/2) {
					System.out.print(" 21 ");
				}
				else if(i==n-1 && j==0) {
					System.out.print(" 4 ");
				}
				else if(i==n-1 && j==n-1) {
					System.out.println(" 3 ");
				}
				else {
					System.out.print(" . ");
				}
			}
			System.out.println();
			
		}
	}
}