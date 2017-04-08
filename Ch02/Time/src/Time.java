
public class Time {

	public static void main(String[] args) {
		
		int hour = 8;
		int minute = 13;
		int second = 43;
		
		int secondsElapsed = hour * 3600 + minute * 60 + second;
		System.out.println("Seconds since midnight: " + secondsElapsed);
		
		int secondsRemaining = 24 * 3600 - secondsElapsed;
		System.out.println("Seconds remaining in day: " + secondsRemaining);
		
		double percentElapsed = 100 * (double)secondsElapsed / (24 * 3600);
		System.out.println("Percent of day elapsed: " + percentElapsed + "%");
		
		int startHour = hour;
		int startMinute = minute;
		int startSecond = second;
		
		hour = 8;
		minute = 28;
		second = 12;
		
		int timeToCompleteExercise = (hour - startHour) * 3600 + 
									 (minute - startMinute) * 60 +
									 (60 - startSecond + second);
		System.out.println("Time to complete exercise: " + timeToCompleteExercise + " seconds");
	}

}
