package sorting;
import java.util.Scanner;
public class Task2 {

public static void main(String[] args) 
	{
		int i=0;
		int j=0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	
		System.out.println("Enter the index i : "+ n);
		pt(n,i,j);
	}
public static int pt(int n,int i,int j) 
{
	if(i<n) {
	if(j<n) {
		if(i==0 || i==n/2 || i==n-1) {
			System.out.print(" * ");
			}
			else if(i==j) {
			System.out.print(" * ");
			}
			else{
			System.out.print("   ");
			}
			return pt(n,i,j+1);
			}
			System.out.println();
			return pt(n, i+1, j=0);
			}
			return i;
}
}
