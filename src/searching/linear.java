package searching;
import java.util.Scanner;
public class linear {
	public static void main(String[] args) 
	{
		int arr[] = {2,5,6,9,4,7};
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n) 
			{
				res = i;
				break;
			}
			System.out.println("index:" +res);
		}
	}
}