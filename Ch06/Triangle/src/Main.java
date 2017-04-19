
public class Main {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 1;
		int c = 1;
		System.out.printf("\na = %d, b = %d, c = %d, isTriangle? %b", 
				a, b, c, isTriangle(a, b, c));
		
		a = 12;
		b = 13;
		c = 20;
		System.out.printf("\na = %d, b = %d, c = %d, isTriangle? %b", 
				a, b, c, isTriangle(a, b, c));
		
	}

	private static boolean isTriangle(int a, int b, int c) {
		if (a > b && a > c) {
			return a < b + c;
		} else if (b > a && b > c) {
			return b < a + c;
		} else if (c > a && c > b){
			return c < a + b;
		}
		return false;
	}
}
