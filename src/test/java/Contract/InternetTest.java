package Contract;

import Person.Person;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class InternetTest extends TestCase {
    private Calendar start_date;
    private Calendar end_date;
    private Person p;
    private Person p2;
    private Person p3;
    private int speed1;
    private int speed2;
    private Internet i1;
    private Internet i2;
    private Internet i3;

    @Before
    public void setUp() throws Exception {
        start_date = new GregorianCalendar(2000, 06, 11);
        end_date = new GregorianCalendar(2020, 06, 11);
        p = new Person(120, "Fred K Markus", 12, 6, 1950, 3215, 965000, "male");
        p2 = new Person(3000, "John K Ford", 12, 6, 1980, 4600, 300000, "male");
        p3 = new Person(3000, "John K Ford", 12, 6, 1980, 4600, 300000, "male");
        speed1 = 120;
        speed2 = 300;
        i1 = new Internet(900, 500, start_date, end_date, p, speed1);
        i2 = new Internet(300, 250, start_date, end_date, p2, speed2);
        i3 = new Internet(300, 250, start_date, end_date, p3, speed2);
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(true, i2.equals(i3));
        Assert.assertEquals(false, i1.equals(i3));
    }

    @Test
    public void testToString() {
        String result = "Contract: [Id=900, ContractNumber=500,Expiration date from: 2000/6/11 - 2020/6/11 Person: [Id=120, FIO =Fred K Markus, Date of birth=1950/6/12, Passport series =3215, Passport number=965000, Sex=man, Age=71], Speed of connection: 120]";
        Assert.assertEquals(result, i1.toString());
    }

}