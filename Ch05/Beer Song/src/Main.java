
public class Main {

	public static void main(String[] args) {
		
		singVerse(99);
	}
	
	private static void singVerse(int bottles) {
		if (bottles > 1) {
			System.out.println(bottles + " bottles of beer on the wall,");
			System.out.println(bottles + " bottles of beeer.");
			System.out.println("Take one down, pass it around.");
			bottles--;
			if (bottles > 1) {
				System.out.println(bottles + " bottles of beer on the wall.\n");
			} else if (bottles == 1) {
				System.out.println(bottles + " bottle of beer on the wall.\n");
			}
			singVerse(bottles);
		} else if (bottles == 1) {
			System.out.println(bottles + " bottle of beer on the wall,");
			System.out.println(bottles + " bottle of beeer.");
			System.out.println("Take one down, pass it around.");
			System.out.println("No more bottles of beer on the wall.");
		}
	}
}
