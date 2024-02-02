package fsd.bacics.control;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your num : ");
       int a = scanner.nextInt();
       if (a%2<=0)
       {
    	   System.out.println("even");
       }
       else
       {
    	   System.out.println("odd");
       }
    		   
	}
}
	