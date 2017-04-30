
public class Main {

	public static void main(String[] args) {
		
		int[] histogram = letterHist("Mary had a little lamb. It's fleece was white as snow.");
		
		for (int i = 0; i < histogram.length; i++) {
			System.out.println(histogram[i]);
		}
	}

	private static int[] letterHist(String text) {
		int[] histogram = new int[26];
		text = text.toLowerCase();
		int index;
		
		for (char c : text.toCharArray()) {
			index = (int)c - 97;
			if (index >= 0 && index <= 25) {
				histogram[index]++;
			}
		}
		
		return histogram;
	}
	
}
