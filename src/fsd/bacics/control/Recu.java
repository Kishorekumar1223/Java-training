package fsd.bacics.control;

public class Recu {
// Print in order
	public static void main(String[] args) {
		
		{
			int [] arr = {8,5,3,2,9};
			recursion(arr,0);}
		}
		private static int recursion(int[] arr, int i) 
		{	
				{
					if(i<arr.length)
					{
						System.out.println(i);
						recursion(arr,++i);
					}
					return i;
				}
				
		}
		}