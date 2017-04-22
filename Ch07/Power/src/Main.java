
public class Main {

	public static void main(String[] args) {
		
		System.out.println(power(2, 8));
	}

	private static double power(double n, double e) {
		
		double answer = 1.0;
		
		for (int i = 1; i <= e; i++) {
			answer = answer * n;
		}
		
		return answer;
	}
}
