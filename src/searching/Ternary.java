package searching;
public class Ternary {
	public static void main(String[] args){
	{

		int []arr = {2,4,7,8,9,12,13,14,15,16,17,18,19,20};
		int n=4;
		print("Binary",binarysearch(arr,n),n);
	}
	private static void print(String search ,int res,int n) {
		if(res!=-1) 
			System.out.println(search +"search:value: "+n+" index: "+res);
		else 
			System.out.println(search +"search: :(");
	}
private static int binarysearch(int[] arr, int n) {
		int start=0;
		int end = arr.length-1;
		int loopexcution =0;
		while(start<=end) 
		{
			loopexcution++;
			int mid =(end+start)/2;
			if(arr[mid] == n) {
				System.out.println("binary search loop excution: "+loopexcution);
				return mid;
			}
			else if (arr[mid]<n){
				start= mid+1;
			}
			else if(arr[mid]>n){
				end =mid-1;
			}
		}
		System.out.println("binary search loop excution: "+loopexcution);
		return -1;
	}	
}