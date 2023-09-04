
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {10,38,34,23,85,49,84,58,93,72,52};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++)
			{
			int temp=0;
			if(arr[i]<arr[j])
			{
				temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
		}	
	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" | ");
		}
	}
}
