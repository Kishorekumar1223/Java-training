package bst;
public class BstSample {
	public static void main(String[] args) {
		int arr[]= {8,9,3,4,7,6,12};
		int root=0;
		int find=9;
		int i =0;
		System.out.println(BST(root,arr,i));
		System.out.println(bst(find,arr,i));
	}
	public static int BST(int root,int [] arr,int i) {
		root =8;
		if(i<arr.length) {
			if(i<=root) {
				System.out.println(arr[i]);
			}
			else if(i>root) {
				System.out.println(arr[i]);
			}
		}
		return BST(root,arr,i+1);	
	}
	public static Boolean bst(int find,int [] arr,int i) {
		if(i<arr.length) {
		if(find==arr[i]){
			return true;
		}else {
			return false;
		}
	}
		return bst(find, arr, i+1);
	}
}