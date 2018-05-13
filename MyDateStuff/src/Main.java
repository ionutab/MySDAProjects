import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	/*
		ATENTIE! JAVA 8! - check project structure IntelliJ
	*/
    public static void main(String[] args) {
        System.out.println("Hello Date!");

        Date d1 = new Date();
        for(int i = 0; i < 103000; i++){
            int x = 2*i + 45;
        }
        Date d2 = new Date();
        for(int i = 0; i < 130000; i++){
            int x = 2*i + 45;
        }
        Date d3 = new Date();

        System.out.println(d1);
        System.out.println(d1.getTime());

        DateFormat defaultFormat = new SimpleDateFormat();
        System.out.println(defaultFormat.format(d1));

        DateFormat customFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(customFormat.format(d1));

        System.out.println("--");
        DateFormat customFormat2= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");
        System.out.println(customFormat2.format(d1));
        System.out.println(customFormat2.format(d2));
        System.out.println(customFormat2.format(d3));
        System.out.println("--");
        DateFormat customFormat3 = new SimpleDateFormat("HH:mm");
        System.out.println(customFormat3.format(d1));
        System.out.println(customFormat3.format(d2));
        System.out.println(customFormat3.format(d3));
        System.out.println("--");
        Date myDate = new Date(0L);
        System.out.println(customFormat2.format(myDate));

        try {
            System.out.println("--");
            Date myDate2 = customFormat2.parse("05/06/2000 20:03:01 234");
            System.out.println(customFormat2.format(myDate2));
            System.out.println(myDate2.getTime());
        } catch (Exception e){
            System.out.println(e);
        }

        try {
            System.out.println("--");
            Date myDate3 = customFormat2.parse("05/06/2050 20:03:01 234");
            System.out.println(customFormat3.format(myDate3));
        } catch (Exception e){
            System.out.println(e);
        }

        try {
            System.out.println("--");
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            DateFormat dfz = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
            Date myDate3 = df.parse("05/06/2020 20:03:01");
            System.out.println(dfz.format(myDate3));


            System.out.println("-- 88");
            ZonedDateTime zonedDateTime = ZonedDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            DateTimeFormatter dtfz = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
            System.out.println(zonedDateTime.format(dtf));
            System.out.println(zonedDateTime.format(dtfz));

            ZoneId zoneIdLondon = ZoneId.of("Europe/London");
            ZonedDateTime zonedDateTimeLondon = zonedDateTime.withZoneSameInstant(zoneIdLondon);
            System.out.println(zonedDateTimeLondon.format(dtfz));

            ZoneId zoneIdNY = ZoneId.of("America/New_York");
            ZonedDateTime zonedDateTimeNY = zonedDateTime.withZoneSameInstant(zoneIdNY);
            System.out.println(zonedDateTimeNY.format(dtfz));

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
