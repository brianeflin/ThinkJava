
public class Main {

	public static void main(String[] args) {
		
		double[] a = {1, 2, 3, 4, 5};
		powerArray(a, 3);
		
		for (double num : a) {
			System.out.print(num + ", ");
		}
	}

	public static double[] powerArray(double[] a, double power) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i], power);
		}
		return a;
	}
}
