
public class StatisticsQuiz {
	public static void main(String[] args) {
		int[] ar = { 3, 8, 2, 5, 9, 4, 7 };

		System.out.println("Sum: " + sum(ar));
		System.out.println("Max: " + max(ar));
		System.out.println("Min: " + min(ar));
		System.out.println("Avg: " + avg(ar));
	}

private static int avg(int[] ar) {
	int sum=0;
	for(int i=0;i<ar.length;i++)sum+=ar[i];
	return sum/ar.length;
}

	private static int min(int[] ar) {
		int max1=0;
		for(int i=0;i<ar.length;i++)i>i+1?""
		return sum;
	}

	private static int max(int[] ar) {
		return 0;
	}

	private static int sum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++)sum+=i;
		return sum;
		
	}
}
