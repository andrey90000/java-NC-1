package Person;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest extends TestCase {
    Person p = new Person(120, "Fred K Markus", 12, 6, 1950, 3215, 965000, "male");
    Person p2 = new Person(3000, "John K Ford", 12, 6, 2000, 4600, 300000, "male");
    Person p3 = new Person(3000, "John K Ford", 12, 6, 2000, 4600, 300000, "male");

    @Test
    public void testEquals() {
        System.out.println(p);
        Assert.assertEquals(true, p2.equals(p3));
        Assert.assertEquals(false, p.equals(p3));
    }

    @Test
    public void testToString() {
        String result = " Person: [Id=120, FIO =Fred K Markus, Date of birth=1950/6/12, Passport series =3215, Passport number=965000, Sex=man, Age=71]";
        Assert.assertEquals(result, p.toString());
    }
}