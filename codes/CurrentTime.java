import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
	public static void main(String args[]) {
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
			
		System.out.println("Current Time: " + currentTime.format(formatter));
	}
}	