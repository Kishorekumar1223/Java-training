package fsd.bacics.Recursive;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		if(n%2 == 0)
		{
			System.out.println("The given mumber " + n +" is even"); 
		}else {
			System.out.println("The given mumber " + n +" is Odd");
		}
	}

}
