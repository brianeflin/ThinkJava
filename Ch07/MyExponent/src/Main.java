
public class Main {

	public static void main(String[] args) {
		
		double x = 100.0;
		double answer = Math.exp(x);
		
		for (int n = 1; n <= 150; n++) {
			check(x, n, answer);
		}
	}
	
	private static void check(double x, int n, double answer) {
		System.out.println(x + "\t" + myExp(x, n) + "\t" + answer);
	}
	
	private static double myExp(double x, int i) {
		
		// e^x = 1 + x + x^2/2! + x^3/3! + x^4/4! + ... + x^i/i!
		
		double e = 1 + x;
		double numerator = x;
		double denominator = 1;
		
		for (int j = 2; j <= i; j++) {
			numerator *= x;
			denominator *= j;
			e += numerator / denominator;
		}
		
		return e;
	}
	
	/*
	private static int factorial(int num) {
		
		int answer = 1;
		
		for (int i = num; i > 0; i--) {
			answer *= i;
		}
		
		return answer;
	}
 	*/
	
}
