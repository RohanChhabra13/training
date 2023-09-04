import java.util.Arrays;

public class Example2 {
public static void main(String[] args) {
	int[] first = {3,6,8,1};
	int[] second = {2,4,7,9,5};
	
	
	mergeArray(first,second);
	System.out.println(Arrays.toString(first));
	
}

private static void mergeArray(int[] first, int[] second) {
	int[] third = new int[first.length+second.length];
	int k;
	for(k=0;k<first.length;k++) {
		third[k]=first[k];
	}
	for(int j=k;k<second.length;k++) {
		third[m]=second[j];
	}
}
}