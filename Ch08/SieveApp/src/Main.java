
public class Main {

	public static void main(String[] args) {
		
		int arrayMax = 55;
		boolean[] prime = sieve(arrayMax);
		
		for (int i = 2; i <= arrayMax; i++) {
			System.out.println(i + ": " + prime[i]);
		}
	}

	private static boolean[] sieve(int n) {
		
		boolean[] a = new boolean[n+1];
		boolean valueChanged = false;
		
		for (int i = 2; i <= n; i++) {
			a[i] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (a[i] == true) {
				for (int j = 2 * i; j <= n; j += i) {
					if (a[j] == true) {
						a[j] = false;
						valueChanged = true;
					}
				}
				if (valueChanged == false) {
					break;
				} else {
					valueChanged = false;
				}
			}
		}
		
		return a;
	}
}
