
public class Main {

	public static void main(String[] args) {
		Time t = new Time(23, 159, 159.9);
		System.out.println(t);
		
		Time start = new Time(18, 50, 0.0);
		Time duration = new Time(2, 16, 0.0);
		System.out.println(start.add(duration));
		
		start.setHour(18);
		start.setMinute(50);
		start.setSecond(0.0);
		start.increment(8160);
		System.out.print(start);
	}

}
