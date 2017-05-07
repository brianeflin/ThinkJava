
public class Time {

	private int hour;
	private int minute;
	private double second;
	
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}
	
	public Time(int hour, int minute, double second) {
		this.minute = (int)second / 60;
		this.second = second % 60;
		this.minute += minute;
		this.hour += this.minute / 60;
		this.minute = this.minute % 60;
		this.hour += hour;
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%04.1f\n", 
				hour, minute, second);
	}
	
	public Time add(Time t2) {
		this.second += t2.second;
		this.minute += (int)this.second / 60;
		this.second = this.second % 60;
		
		this.minute += t2.minute;
		this.hour += this.minute / 60;
		this.minute = this.minute % 60;
		
		this.hour += t2.hour;
		
		return this;
	}
	
	public Time increment(double seconds) {
		Time t2 = new Time(0, 0, seconds);
		return this.add(t2);
	}
}
