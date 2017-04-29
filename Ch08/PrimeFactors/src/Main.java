
public class Main {

public static void main(String[] args) {
		
		int number = 15;
		int[] factors = {3, 5};
		System.out.println(arePrimeFactors(number, factors));
	}

	private static boolean arePrimeFactors(int number, int[] factors) {
		
		for (int factor : factors) {
			if (number % factor != 0 || !isPrime(factor)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPrime(int num) {
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
