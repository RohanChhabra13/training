
public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {10,38,34,23,85,49,84,58,93,72,52};
		    for (int i = 0; i < arr.length - 1; i++) {
		        int min = i;
		        for (int j = i + 1; j < arr.length; j++) {
		            if (arr[min] > arr[j]) {
		                min = j;
		            }
		        }

	        if (min != i) {
		            int temp = arr[i];
		            arr[i] = arr[min];
		            arr[min] = temp;
		        }
		    }
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.print(arr[i]+" | ");
		    }
	}
}
