package Array;

import Contract.Internet;
import Contract.Mobile;
import Contract.Television;
import Person.Person;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArrayListTest extends TestCase {
    protected Calendar start_date;
    private Calendar end_date;
    private Person p;
    int speed1;
    int minute1;
    int gb1;
    int sms1;
    String pack1;
    private Internet i1;
    private Mobile m1;
    private Television t1;

    @Before
    public void setUp() throws Exception {

        start_date = new GregorianCalendar(2000, 06, 11);
        end_date = new GregorianCalendar(2020, 06, 11);
        p = new Person(120, "Fred K Markus", 12, 6, 1950, 3215, 965000, "male");
        speed1 = 120;
        i1 = new Internet(900, 500, start_date, end_date, p, speed1);
        minute1 = 90;
        gb1 = 30;
        sms1 = 100;
        m1 = new Mobile(900, 500, start_date, end_date, p, minute1, gb1, sms1);
        pack1 = "Beginner";
        t1 = new Television(900, 500, start_date, end_date, p, pack1);

    }

    @Test
    public void testAdd() {

        ArrayList a = new ArrayList(0);
        a.add(i1);
        a.add(m1);
        a.add(t1);

        Assert.assertEquals(3, a.getSize());
    }

    @Test
    public void testDelete() {
        ArrayList a2 = new ArrayList(5);
        a2.add(i1);
        a2.add(m1);
        a2.add(t1);
        a2.delete(i1);
        a2.delete(m1);
        Assert.assertEquals(1, a2.getSize());
    }

    @Test
    public void testGetElem() {
        ArrayList a3 = new ArrayList(1);
        a3.add(i1);
        a3.add(m1);
        a3.add(t1);
        Object result = a3.getElem(1).toString();
        Assert.assertEquals(m1.toString(), result);
    }

    @Test
    public void testEquals() {
        ArrayList a4 = new ArrayList(1);
        a4.add(t1);
        a4.add(m1);
        ArrayList a5 = new ArrayList(1);
        a5.add(t1);
        a5.add(m1);
        Assert.assertEquals(true, a4.equals(a5));
    }

    @Test
    public void testToString() {
        ArrayList a6 = new ArrayList(1);
        a6.add(4);
        a6.add(7);
        a6.add(8);
        String exp = "[4, 7, 8]";
        Assert.assertEquals(exp, a6.toString());
    }

}
