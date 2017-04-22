
public class Main {

	public static void main(String[] args) {
		
		System.out.println("squareRoot(49) = " + squareRoot(49));
	}

	private static double squareRoot(double a) {
		
		double x0 = 0.0;
		double x1 = a / 2.0;
		
		while (Math.abs(x0 - x1) > 0.0001) {
			x0 = x1;
			x1 = (x0 + a / x0) / 2.0;
		}
		
		return x1;
	}
}
