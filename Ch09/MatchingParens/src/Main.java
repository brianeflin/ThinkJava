
public class Main {

	public static void main(String[] args) {
		
		String s = "{{{}}((3 + 7) * 2)";
		int count = countParens(s, '}');
		System.out.println(count);
	}

	private static int countParens(String s, char charToCount) {
		int count = 0;
		char openingChar = '(';
		char closingChar = ')';
		
		if (charToCount == '[' || charToCount == ']') {
			openingChar = '[';
			closingChar = ']';
		} else if (charToCount == '{' || charToCount == '}') {
			openingChar = '{';
			closingChar = '}';
		}
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c == openingChar) {
				count++;
			} else if (c == closingChar) {
				count--;
			}
		}
		return count;
	}

	
}
