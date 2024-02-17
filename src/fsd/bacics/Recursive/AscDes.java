package fsd.bacics.Recursive;

public class AscDes {

	public static void main (String[] args) 
	{
		int []arr = {34,56,78,65,43,45,32};
		int [] aseRes = asc(arr,0,0);
		System.out.println("Asc");
		print(aseRes);
		int [] dsecRes = desc(arr,0,0);	
		System.out.println("Desc");
		print(dsecRes);	
	}
	private static void print(int[] arr) {
		for(int i =0; i< arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}	
	}
	private static int[] asc(int[] arr, int i, int j) {
		if(j<arr.length-1)
		{ j++;
		
		}
		else {
			j=0; i++;
		}
		if (i<arr.length) {
			if (arr[i]<arr[j])
			{
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
			asc(arr,i,j);
		}
		return arr;
		}
	private static int[] desc(int[] arr, int i, int j) {
		if(j<arr.length-1)
		{ j++;
		
		}
		else {
			j=0; i++;
		}
		if (i<arr.length) {
			if (arr[i]>arr[j])
			{
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
			}
			desc(arr,i,j);
		}
		return arr;
	}
	}
	
