package fsd.bacics.control;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 1;
		int i=1;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your num : ");
       int a = scanner.nextInt();
       do 
       {  
    	   
    	   b=b*i;
    	   i++;
    	 }while(i<=a);
       System.out.println(b);
	}
}