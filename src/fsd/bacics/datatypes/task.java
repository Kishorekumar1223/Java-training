package fsd.bacics.datatypes;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==n-1 || j==0){
					System.out.print("*");
				}
				else if(i==3 && j==1 || i==2 && j==2){
					System.out.print("*");
				}
				else if(i==1 && j==3 || i==0 && j==4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
	}
}
}