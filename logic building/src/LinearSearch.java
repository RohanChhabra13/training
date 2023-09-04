import java.util.Arrays;

public class LinearSearch {
	
	
	
public static void main(String[] args) {
	int k=72;
	int a = 0;
	int arr[] = {10,38,34,23,85,23,49,84,58,93,72,52};
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==k)
		{
			a = arr[i];
		}
	}
	
	System.out.println(a);
}}
