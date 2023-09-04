import java.util.Scanner;
import java.lang.StringBuilder;
public class PalindromeQuiz {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = console.next();
		
		System.out.println(checkPalindrome(word)?"Palindrome":"Not Palindrome");
	}
	
	private static boolean checkPalindrome(String word) {
		
		StringBuilder ss = new StringBuilder(word);
		StringBuilder s2 = new StringBuilder(ss.reverse());
		//System.out.println(ss+" "+s2);
		if(word.equals(String.valueOf(s2))return true;
		return false;
		
		
//		int i =0;
//		int j = word.length()-1;
//		
//		while(i<j) {
//			if()
//		}
	
	}
}
