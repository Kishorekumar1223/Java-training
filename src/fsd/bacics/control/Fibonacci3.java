package fsd.bacics.control;
import java.util.Scanner;
public class Fibonacci3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci series :" );
		int a = scanner.nextInt();
		int  [] arr=new int[a];
		arr[0]= 1; arr[1]= 1;
		int sum = arr[0]+arr[1];
		for(int i=2;i<a;i++)
		{
			//System.out.println(arr[i]+" = "+arr[1]);
			arr[i] = arr[i-2]+ arr[i-1];
			sum =sum+ arr[i];

		}
		System.out.println(sum);
		
		 for (int i = arr.length-1;i>=0;i++)
	      {
	    	  System.out.println(arr[i]+"  : "+i);
	      }
		System.out.println( "arr.length = "+ arr.length );
	}

}
