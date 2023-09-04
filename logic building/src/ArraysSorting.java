import java.util.Arrays; 

public class ArraysSorting {

	public static void main(String[] args) {
		int []ar = {5,3,1,2,4};
//		for(int i:ar) {
//			System.out.println(i);
//		}
//		System.out.println("Sorted array with Java API");
//		Arrays.sort(ar);
//		
//		for(int i:ar)System.out.println(i);
		//Write your logic of sorting array
		long start = System.currentTimeMillis();
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					ar[i]+=ar[j];
					ar[j]=ar[i]-ar[j];
					ar[i]=ar[i]-ar[j];
				}
			}
		}
		Arrays.sort(ar);
		long end = System.currentTimeMillis();
		for(int i:ar)System.out.println(i);
		
		System.out.println("Time taken: "+(end-start)+" ms");
		
		int[] arr  = {4,3,2,3,6};
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
		
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		for(int i:arr)System.out.println(i);
		
		
		int []arr1 = {6,2,4,9,1};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr1[i]<arr1[j]) {
					arr1[i]+=arr1[j];
					arr1[j]=arr1[i]-arr1[j];
					arr1[i]=arr1[i]-arr1[j];
					
					
				}
			}
		}
		for(int i:arr1)System.out.println(i);
	}
}
