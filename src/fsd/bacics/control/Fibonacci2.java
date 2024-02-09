package fsd.bacics.control;
import java.util.Scanner;
public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  t1= 0,t2 =1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci series :" );
		int a = scanner.nextInt();
		int sum = 0;
		int i=1;
		do
		{
			System.out.print(t2 + " ");
			int nxt = t1 + t2;
			t1=t2;
			t2 = nxt;
			sum =sum+ t1;
			i++;

		}while(i<=a);
		System.out.println();
		System.out.println(sum);

	}

}
