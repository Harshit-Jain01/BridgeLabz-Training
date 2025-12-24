import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZones{

	public static void main(String[] args) {

		// GMT 
		ZonedDateTime gt=ZonedDateTime.now(ZoneId.of("GMT"));
		System.out.println("Current Time in GMT: "+gt);

		// IST 
		ZonedDateTime it=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST: "+it);

		// PST 
		ZonedDateTime pt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current Time in PST: "+pt);
	}
}
