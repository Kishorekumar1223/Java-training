package treeTraversal;
public class Task1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,11,23,45};
		int find = 98;
		int n = 45;
		int i=0;
		int st=0;
		int end = arr.length-1;
		int x =5;
		System.out.println(linear(arr, find,i));
		System.out.println(prime(find,2));
		System.out.println(binary(arr,st,end,n));
		}
		public static int linear(int [] arr,int find,int i) {
		if(i<arr.length) {
			if(arr[i]==find) {
				System.out.println("index : "+i);
			}
			linear(arr, find, i+1);
		}
		return -1;
		}
		public static boolean prime(int  num ,int i) {
				if(num == i) {
					return true;
				}
				else if(num %i==0) {
					return false;
				}
				return prime(num,i+1);
			
		}
		private static int binary(int[] arr,int st,int end,int n) {
			int mid =st+(end -st)/2;
			if(st<=end) 
			{
				if(arr[mid] == n) {
					return mid;
				}
				else if (arr[mid]<=n){
					st= mid+1;
				}
				else if (arr[mid]>=n){
					end =mid-1;
				}
			}
			return binary(arr, st, end, n);
			
		}
		public int pattern() {
			
			return 0;
		}
}
