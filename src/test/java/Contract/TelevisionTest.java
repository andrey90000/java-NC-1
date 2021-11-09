package Contract;

import Person.Person;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TelevisionTest extends TestCase {
    private Calendar start_date;
    private Calendar end_date;
    private Person p;
    private Person p2;
    private Person p3;
    private String pack1;
    private String pack2;
    private Television t1;
    private Television t2;
    private Television t3;

    @Before
    public void setUp() throws Exception {
        start_date = new GregorianCalendar(2000, 06, 11);
        end_date = new GregorianCalendar(2020, 06, 11);
        p = new Person(120, "Fred K Markus", 12, 6, 1950, 3215, 965000, "male");
        p2 = new Person(3000, "John K Ford", 12, 6, 1980, 4600, 300000, "male");
        p3 = new Person(3000, "John K Ford", 12, 6, 1980, 4600, 300000, "male");
        pack1 = "Beginner";
        pack2 = "Pro";
        t1 = new Television(900, 500, start_date, end_date, p, pack1);
        t2 = new Television(300, 250, start_date, end_date, p2, pack2);
        t3 = new Television(300, 250, start_date, end_date, p3, pack2);
    }

    @Test
    public void testEquals() {
        Assert.assertEquals(true, t2.equals(t3));
        Assert.assertEquals(false, t1.equals(t2));
    }

    @Test
    public void testToString() {
        System.out.println(t1);
        String result = "Contract: [Id=900, ContractNumber=500,Expiration date from: 2000/6/11 - 2020/6/11 Person: [Id=120, FIO =Fred K Markus, Date of birth=1950/6/12, Passport series =3215, Passport number=965000, Sex=man, Age=71], Channels package: Beginner]";
        Assert.assertEquals(result, t1.toString());
    }

}