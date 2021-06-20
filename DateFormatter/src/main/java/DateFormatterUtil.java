import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateFormatterUtil {

    public static String beautyDate(Object date, String format) {

        if (date instanceof LocalDate localDate) {
            return localDate.format(DateTimeFormatter.ofPattern(format));
        }

        if (date instanceof LocalDateTime localDateTime) {
            return localDateTime.format(DateTimeFormatter.ofPattern(format));
        }

        if (date instanceof OffsetDateTime offsetDateTime) {
            return offsetDateTime.format(DateTimeFormatter.ofPattern(format));
        }

        if (date instanceof ZonedDateTime zonedDateTime) {
            return zonedDateTime.format(DateTimeFormatter.ofPattern(format));
        }

        if (date instanceof Instant instant) {
            return DateTimeFormatter.ofPattern(format).withZone(ZoneId.systemDefault()).format(instant);
        }

        if (date instanceof Calendar calendar) {
            return new SimpleDateFormat(format).format(calendar.getTime());
        }

        if (date instanceof Date utilDate) {
            return new SimpleDateFormat(format).format(utilDate.getTime());
        }

        if (date instanceof XMLGregorianCalendar xmlGregorianCalendar) {
            return new SimpleDateFormat(format).format(xmlGregorianCalendar.toGregorianCalendar().getTime());
        }

        return "";
    }
}
