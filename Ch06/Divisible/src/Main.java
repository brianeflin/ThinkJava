
public class Main {

	public static void main(String[] args) {
		
		System.out.println(isDivisible(5, 2));
	}

	private static boolean isDivisible(int numerator, int denominator) {
		
		return numerator % denominator == 0;
	}
}
