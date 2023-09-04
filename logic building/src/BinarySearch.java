import java.util.Arrays;


public class BinarySearch {
	
	public static int binary(int arr[],int a, int k) {
		int start = 0;
		int end = arr.length;
		while(start<end) {
			int mid = start +(end-start)/2;
			if(arr[mid]==k)
			{
				a = mid;
				break;
			}
			
			else if(arr[mid]>k){
				end = mid-1;
			}
			
			else if(arr[mid]<k){
				start = mid+1;
			}
		
		}
		return a;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,38,34,23,85,49,84,58,93,72,52};
		int k =72;
		int a =0;
		Arrays.sort(arr);
		System.out.println(binary(arr, k, a));
	}
}
