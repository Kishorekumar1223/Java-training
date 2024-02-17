package fsd.bacics.Recursive;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	//int rows =5; Pattern 1
	for(int i= 1;i<=n;i++) {
	for(int j=1;j<=i;++j) {
		System.out.print("*");
	}
	System.out.println();
	}
	}
}
/* pattern 2 reverse
for(int i= 1;i<=n;i++) {
for(int j=1;j<=i;++j) {
	System.out.print("*");
}*/
