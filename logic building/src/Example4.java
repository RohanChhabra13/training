
public class Example4 {
	public static void main(String[] args) {
		String[] vocab = { "is", "are", "am", "of", "an", "a" };
		String quote = "There are Apples";

		boolean flag = false;
		for (String word : vocab) {
			if (quote.indexOf(word) != -1)
				flag = true;
		}
		System.out.println(flag ? "Valid quote" : "Invalid quote");

	}
}
