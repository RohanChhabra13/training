import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[] A = {4,2,7,3,6,9,1,8};
		int i=0;int j=A.length-1;
		while(i<j) {
			A[i]=A[i]+A[j];
			A[j]=A[i]-A[j];
			A[i]=A[i]-A[j];
			i++;
			j--;
			
		}
		System.out.println(Arrays.toString(A));
	}
	
}
