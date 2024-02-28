package sorting;

import java.util.Scanner;

public class PatternTask {

	public static void main(String[] args) 
	{Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();	
	System.out.println("Enter the index i : "+ n);
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || j==0 && i==n/2 || j==n/2){
				System.out.print(" * ");
			}
			else if(i==n/2|| j==n/2){
				System.out.print(" * ");
			}
			else if(i== j) {
				System.out.print(" * ");
			}

			else{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
}
}
