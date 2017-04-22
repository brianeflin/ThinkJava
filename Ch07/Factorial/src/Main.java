
public class Main {

	public static void main(String[] args) {
		
		System.out.println(factorial(6));
	}

	private static int factorial(int n) {
		
		int answer = 1;
		
		for (int i = n; i > 0; i--) {
			answer = answer * i;
		}
		
		return answer;
	}
}
