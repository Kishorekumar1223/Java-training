package fsd.bacics.control;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in); 
       System.out.println("Enter your num1:");
       int a = scanner.nextInt();
       System.out.println("Enter your num2:");
       int b = scanner.nextInt();
       System.out.println("Operator:");
       char c = scanner.next().charAt(0);
      // Arith arith = new Arith();
       int res =0;
       switch(c)
       {
       case '+':
    	   res = a + b;
           System.out.println(a+"+"+b+"="+ res);
           break;
       case '-':
    	   res = a - b;
           System.out.println(a+"-"+b+"="+ res);
           break;
       case '*':
    	   res = a * b;
           System.out.println(a+"*"+b+"="+res);
           break;
       case '/' :
    	   res = a / b;
           System.out.println(a+"/"+b+"="+res);
           break;
       
       }
   	}
}
