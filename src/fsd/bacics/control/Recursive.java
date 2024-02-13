package fsd.bacics.control;

public class Recursive {
// Print in Reverse 
	public static void main(String[] args) {
	
	{
		int [] array = {8,5,3,2,9,7};
		recursion(array,5);}
	}
	private static int recursion(int[] arr, int i) {		
			{
				if(i>=0)
				{
					System.out.println(arr[i]);
					recursion(arr,--i);
				}
				return i;
			}
			
	}
	}
