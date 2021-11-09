package Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.getInstance;

/**
 *
 */
public class Person {
    protected int id;
    protected String fio;
    protected Calendar birthday;
    protected int passportSeries;
    protected int passportNumber;
    protected byte gender;
    protected int age;

    public Person(int _id, String _fio, int bDay, int bMonth, int bYear, int _pS, int _pN, String _gender) {
        id = _id;
        fio = _fio;
        if (bDay > 0 && bDay <= 31) {
            if (bMonth > 0 && bMonth <= 12) {
                if (bYear > 1900 && bYear <= 2021) {
                    birthday = new GregorianCalendar(bYear, bMonth, bDay);
                }

            }
        }
        Calendar date =  Calendar.getInstance();
        age =date.get(Calendar.YEAR)- birthday.get(Calendar.YEAR) ;
        passportSeries = _pS;
        passportNumber = _pN;
        if (_gender == "male" || _gender == "male") {
            gender = 1;
        } else if (_gender == "female" || _gender == "Female") {
            gender = 0;
        }


    }
    public int GetId(){
        return id;
    }
    public Calendar GetBirthday(){
        return birthday;
    }
    public int GetPassportSeries(){
        return passportSeries;
    }
    public int GetPassportNumber(){
        return passportNumber;
    }
    public int GetAge(){
        return age;
    }
    public String GetGender(){
        if(gender==0) return "woman";
        else return "man";
    }
    /**
     * Overrides classic method equals in java
     *
     * @param obj - object for comparison
     * @return Returns - true, if objects are the same;
     * Returns - false in other way.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Person other = (Person) obj;
        if (this.id != other.id)
            return false;
        if (this.passportNumber != other.passportNumber)
            return false;
        if (this.passportSeries != other.passportSeries)
            return false;
        if (this.gender != other.gender)
            return false;
        if (this.fio != other.fio)
            return false;
        if (this.birthday.YEAR == other.birthday.YEAR) {
            if(this.birthday.MONTH == other.birthday.MONTH){
                if(this.birthday.DAY_OF_MONTH == other.birthday.DAY_OF_MONTH) {
                    return true;
                }
                return false;
            }
            return false;
        }


        return true;
    }

    /**
     * Overrides classic method hashcode in java
     *
     * @return Hashcode
     */
    @Override
    public int hashCode() {
        return ((id + gender + passportSeries) % 1000);
    }

    @Override
    public String toString() {
        return " Person: [Id=" + id
                + ", FIO =" + fio
                + ", Date of birth=" + birthday.get(Calendar.YEAR)+"/"+birthday.get(Calendar.MONTH)+"/"+birthday.get(Calendar.DAY_OF_MONTH)
                + ", Passport series =" + passportSeries +
                ", Passport number=" + passportNumber+
                ", Sex="+GetGender()+
                ", Age="+age+"]";
    }


}
