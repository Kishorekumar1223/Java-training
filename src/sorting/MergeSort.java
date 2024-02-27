package sorting;
public class MergeSort
{
	public static void main(String[] args) 
	{
		int [] arr = {21,8,6,19,2,9};
		int i=0;
		int j=0;
		pt(arr, i ,j);
	}
	public static int pt(int [] arr,int i,int j) 
	{
		int start =0;
		int end = arr.length-1;
		while(i<arr.length) 
		{
			int mid =(end+start/2);
			if(j==mid)
			{
				return mid;
			}
			else if(j< arr[mid]) {
				end = mid-1;
			}
			else if(j>arr[mid]) {
				end = mid +1;
			}
		}
		System.out.println(arr[i]);
		i++;
		return i;
	}
}
