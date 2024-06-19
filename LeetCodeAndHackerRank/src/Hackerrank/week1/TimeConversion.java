package Hackerrank.week1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {

	public static void main(String[] args) {
		String timeString = LocalTime.parse("06:00 PM", DateTimeFormatter.ofPattern("hh:mm a", Locale.US))
				.format(DateTimeFormatter.ofPattern("HH:mm"));
		System.out.println(timeString);
		String time = LocalTime.parse("01:04:34PM", DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US))
				.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(time);
	}
}
