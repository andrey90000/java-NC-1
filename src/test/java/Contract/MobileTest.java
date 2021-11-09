package Contract;

import Person.Person;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MobileTest extends TestCase {
    protected Calendar start_date;
    private Calendar end_date;
    private Person p;
    private Person p2;
    private Person p3;
    private int minute1;
    private int minute2;
    private int gb1;
    private int gb2;
    private int sms1;
    private int sms2;
    private Mobile m1;
    private Mobile m2;
    private Mobile m3;

    @Before
    public void setUp() throws Exception {
        start_date = new GregorianCalendar(2000, 06, 11);
        end_date = new GregorianCalendar(2020, 06, 11);
        p = new Person(120, "Fred K Markus", 12, 6, 1950, 3215, 965000, "male");
        p2 = new Person(3000, "John K Ford", 12, 6, 1980, 4600, 300000, "male");
        p3 = new Person(3000, "John K Ford", 12, 6, 1980, 4600, 300000, "male");
        minute1 = 90;
        minute2 = 90;
        gb1 = 30;
        gb2 = 60;
        sms1 = 90;
        sms2 = 90;
        m1 = new Mobile(900, 500, start_date, end_date, p, minute1, gb1, sms1);
        m2 = new Mobile(300, 250, start_date, end_date, p2, minute2, gb2, sms2);
        m3 = new Mobile(300, 250, start_date, end_date, p3, minute2, gb2, sms2);
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(true, m2.equals(m3));
        Assert.assertEquals(false, m1.equals(m3));
    }

    @Test
    public void testToString() {
        String result = "Contract: [Id=900, ContractNumber=500,Expiration date from: 2000/6/11 - 2020/6/11 Person: [Id=120, FIO =Fred K Markus, Date of birth=1950/6/12, Passport series =3215, Passport number=965000, Sex=man, Age=71], Amount of minutes: 90, Amount of minutes: 30, Amount of SMS: 90]";
        Assert.assertEquals(result, m1.toString());
    }


}