package searching;
public class Binary {
	public static void main(String[] args)
	{
		int []arr = {2,4,7,8,9,12,13,14,15,16,17,18,19,20};
		int n=4;
		print("Linear",linearsearch(arr,n),n);
		print("Binary",binarysearch(arr,n),n);
		print("ternary",ternarysearch(arr,n),n);
		print("ternary",ternarysearch(arr,n),n);
	}
	private static void print(String search ,int res,int n) {
		if(res!=-1) 
			System.out.println(search +"search:value: "+n+" index: "+res);
		else 
			System.out.println(search +"search: :(");
	}
	private static int linearsearch(int[] arr, int n) {
		int loopexcution =0;
		for(int i=0;i<arr.length;i++) {
			loopexcution++;
			if(arr[i] == n) {
				System.out.println("linear search loop excution: "+loopexcution);
				return i;
			}
		}
		System.out.println("linear search loop excution: "+loopexcution);
			return -1;
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
	private static int ternarysearch(int start,int end, int[] arr, int n,int res) {
//		int start =0;
//		int end = arr.length-1;
//		int loopexcution =0;
		//while(start<=end) 
		if (start<=end)
		{
			//loopexcution++;
			int mid1= start + (end - start)/3;
			int mid2=end - (end - start)/3;
			if(arr[mid1] == n) {
				//System.out.println("binary search loop excution: "+loopexcution);
				res = mid1;
				return mid1;
			}
			if(arr[mid2] == n) {
				//System.out.println("binary search loop excution: "+loopexcution);
				res = mid2;
				return mid2;
			}
			if (arr[mid1]>n){
				//end = mid1-1;
				res = ternarysearch(start, mid1 -1, arr, n, res);
			}
			else if(arr[mid2]<n){
			//	start = mid2+1;
				res = ternarysearch (mid2 +1,end , arr, n, res);

			}else
			{
//				start =mid1+1;
//				end =mid2-1;
				res = ternarysearch (mid1+1,mid2 +1, arr, n, res);

			}
			
		}
		//System.out.println("ternary search loop excution: "+loopexcution);
		return res;
	}
}
