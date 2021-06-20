import org.junit.Assert;
import org.junit.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatterUtilTest {

    private final String format = "yyyy.MM.dd";
    private final String expected = new SimpleDateFormat(format).format(Calendar.getInstance().getTime());

    @Test
    public void LocalDateTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(LocalDate.now(), format));
    }

    @Test
    public void LocalDateTimeTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(LocalDateTime.now(), format));
    }

    @Test
    public void OffsetDateTimeTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(OffsetDateTime.now(), format));
    }

    @Test
    public void ZonedDateTimeTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(ZonedDateTime.now(), format));
    }

    @Test
    public void InstantTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(Instant.now(), format));
    }

    @Test
    public void CalendarTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(Calendar.getInstance(), format));
    }

    @Test
    public void UtilDateTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(new Date(), format));
    }

    @Test
    public void SqlDateTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(new java.sql.Date(Instant.now().toEpochMilli()), format));
    }

    @Test
    public void XMLGregorianCalendarTest() throws DatatypeConfigurationException {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()), format));
    }

    @Test
    public void GregorianCalendarTest() {
        Assert.assertEquals(expected, DateFormatterUtil.beautyDate(new GregorianCalendar(), format));
    }
}
