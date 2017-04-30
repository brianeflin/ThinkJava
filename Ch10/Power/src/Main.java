import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		System.out.println(pow(2, 64));
	}

	private static BigInteger pow(int x, int n) {
		
		if (n == 0) return BigInteger.valueOf(1);
		
		BigInteger t = pow(x, n / 2);
		
		if (n % 2 == 0) {
			return t.multiply(t);
		} else {
			return t.multiply(t).multiply(BigInteger.valueOf(x));
		}
	}
}
