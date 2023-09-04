import java.util.Scanner;

public class PrimeNumberQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = console.nextInt();
		
		System.out.println(checkPrime(num)?"Prime No.":"Composite No.");
	}
	private static boolean checkPrime(int num) {
		int count = 0 ;
		for(int i=1;i<num/2;i++) {
			if(num%i==0)count++;
		}
		if(count>1)return false;
		return true;
	}
}
