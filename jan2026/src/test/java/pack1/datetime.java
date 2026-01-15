package pack1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.Period;
public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instant currenttime=Instant.now();
System.out.println("current time:"+currenttime);
LocalDate now=LocalDate.now();
LocalDate Independence=LocalDate.of(1947,Month.AUGUST,15);
Period period=Independence.until(now);
System.out.println("Independence:"+Independence);
System.out.println("now:"+now);
System.out.println("tomorrow:"+now.plusDays(1));
System.out.println("lastmonth:"+now.minusMonths(1));
System.out.println("leap year:"+now.isLeapYear());
System.out.println("move to 30th day of month:"+now.withDayOfMonth(30));
System.out.println("period:"+period);
ZonedDateTime ct=ZonedDateTime.now();
ZonedDateTime ctinparis=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
System.out.println("india time:"+ct);
System.out.println("paris time:"+ctinparis);

	}

}
