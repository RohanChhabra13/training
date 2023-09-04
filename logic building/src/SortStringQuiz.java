import java.util.Scanner;

public class SortStringQuiz {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = console.next();

		String result = sort(word);
	}

	private static String sort(String w) {
		char[] word = w.toCharArray();
		for(int i=0;i<word.length;i++) {
			for(int j=0;j<word.length;j++) {
				Character x = word[i];
				Character y = word[j];
				
				if(x.compareTo(y)>0) {
					char c= x;
					x = y;
					y = c;
				}
			}
		}
		
		return new String(word);
	}
}
