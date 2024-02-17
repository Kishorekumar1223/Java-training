package fsd.bacics.Recursive;

public class Dublicate 
{

	public static void main(String[] args) 
	{
		int [] arr = {8,21,19,8,19,77,3,4,21,99};
		duplicate(arr,0,0);
	}

	private static void duplicate(int[] arr, int i, int j) 
	{
		if(j < arr.length -1)
		{
			j=j+1;
		}
		else 
		{
			i=i+1;
			j=i+1;
		}
		//System.out.println("Function call i: "+i+"j:"+j);
		if(i < arr.length-1){
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]+" is Duplicate");
			}
			duplicate(arr, i, j);
		}	
		//System.out.println("Function return i: "+i+"j:"+j);
	}
	}
