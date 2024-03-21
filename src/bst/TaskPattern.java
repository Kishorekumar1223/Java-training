package bst;
import java.util.Scanner;
public class TaskPattern {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int mid = n/2;
	System.out.println("Enter the index i : "+ n);
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==j || j==n-i+1) {
				System.out.print(" * ");
			}
//			else if(i==mid || j==mid+j){
//				System.out.print(" * ");
//			}
//			else if() {
//				System.out.print(" * ");
//			}
			else{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
}
}