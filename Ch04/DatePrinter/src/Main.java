
public class Main {

	public static void main(String[] args) {
		String day = "Saturday";
		int date = 8;
		String month = "April";
		int year = 2017;
		
		printDateAmerican(day, date, month, year);
		printDateEuropean(day, date, month, year);
	}

	private static void printDateEuropean(String day, int date, String month, int year) {
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);
	}

	private static void printDateAmerican(String day, int date, String month, int year) {
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}

}
