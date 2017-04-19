
public class Main {

	public static void main(String[] args) {
		
		System.out.println(power(2, 8));
	}

	private static double power(double x, int n) {
		if (n == 0) {
			return 1;
		}
		double result = x * power(x, n - 1);
		return result;
	}
}
