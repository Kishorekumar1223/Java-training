package fsd.bacics.Recursive;

import java.util.Scanner;

public class LargeNumArr {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no of element want in array:");
	int a = scanner.nextInt();
	int arr[]=new int[a];
	System.out.println("Enter all the element:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	int lar1,lar2,temp;
	lar1=arr[0];
	lar2=arr[1];
	if(lar1<lar2)
	{
		temp = lar1;
		lar1=lar2;
		lar2=temp;
		}
	for(int i=2;i<arr.length;i++) {
		if(arr[i]>lar1) {
			lar2=lar1;
			lar1=arr[i];}
		else if (arr[i]>lar2 && arr[i]!=lar1) {
			lar2=arr[i];}
		}
	System.out.println("The first largest is "+lar1);
	System.out.println("The second largest is "+lar2);
	}

}
