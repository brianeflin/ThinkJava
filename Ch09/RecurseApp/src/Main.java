
public class Main {

	public static void main(String[] args) {
		
		String s = "";
		String s1 = "";
		String s2 = "";
		
//		s = "In the beginning was the word";
		
//		System.out.println(first(s));
//		System.out.println(rest(s));
//		System.out.println(middle(s));
//		System.out.println(length(s));
//		printString(s);
//		printBackward(s);
//		System.out.println(reverseString(s));
		
//		s = "Pop";
//		System.out.println(isPalindrome(s));
		
//		s = "AbcDe";
//		System.out.println(isAbecedarian(s));
		
//		s = "AaBbCcD";
//		System.out.println(isDoubloon(s));
		
//		s1 = "spots";
//		s2 = "stops";
//		System.out.println(isAnagram(s1, s2));
		
		s1 = "quijibo";
		s2 = "jiboz";
		System.out.println(canSpell(s1, s2));
	}

	private static char first(String s) {
		return s.charAt(0);
	}
	
	private static String rest(String s) {
		return s.substring(1);
	}
	
	private static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}
	
	private static int length(String s) {
		return s.length();
	}
	
	private static void printString(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static void printBackward(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}
	
	private static String reverseString(String s) {
		String reversed = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		
		return reversed;
	}
	
	private static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		
		if (s.length() == 1) {
			return true;
		} else if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		} else if (middle(s).length() <= 1) {
			return true;
		} else {
			return isPalindrome(middle(s));
		}
	}
	
	private static boolean isAbecedarian(String s) {
		s = s.toLowerCase();
		char[] charArray = s.toCharArray();
		
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] > charArray[i + 1]) return false;
		}
		return true;
	}
	
	private static boolean isDoubloon(String s) {
		int[] charHist = makeCharHistogram(s);
		
		for (int i = 0; i < charHist.length; i++) {
			if (charHist[i] > 2 || (charHist[i] < 2 && charHist[i] != 0)) 
				return false;
		}
		return true;
	}

	private static int[] makeCharHistogram(String s) {
		s = s.toLowerCase();
		char[] charArray = s.toCharArray();
		int[] charHist = new int[26];
		int index;
		
		for (int i = 0; i < charArray.length; i++) {
			index = (int)charArray[i] - 97;
			if (index >= 0 && index <= 25) {
				charHist[index]++;
			}
		}
		return charHist;
	}
	
	private static boolean isAnagram(String s1, String s2) {
		int[] charHist1 = makeCharHistogram(s1);
		int[] charHist2 = makeCharHistogram(s2);

		for (int i = 0; i < charHist1.length; i++) {
			if (charHist1[i] != charHist2[i]) return false;
		}
		return true;
	}
	
	private static boolean canSpell(String letters, String word) {
		int[] lettersHist = makeCharHistogram(letters);
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {
			int index = (int)word.charAt(i) - 97;
			if (lettersHist[index] > 0) {
				lettersHist[index]--;
			} else {
				return false;
			}
		}
		return true;
	}
}
