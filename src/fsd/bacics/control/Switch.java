package fsd.bacics.control;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your num : ");
    int a = scanner.nextInt();
    
    switch (a%2)
    {
    case "+":
        System.out.println("a"+"+"+b+"=");
        break;
    case 1:
        System.out.println("Odd");
        break;
    
    }
	}

}
     // Nested if