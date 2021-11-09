package Contract;

import Person.Person;

import java.util.Calendar;

/**
 * Class Mobile extends Contract class and keeps information about mobile contract.
 *
 * @author Усов Андрей
 */
public class Mobile extends Contract {
    /**
     * field minuteAmount:Amount of minute is provided by contract
     */
    protected int minuteAmount;
    /**
     * field minuteAmount:Amount of gigabyte is provided by contract
     */
    protected int gigabyteAmount;
    /**
     * field minuteAmount:Amount of sms is provided by contract
     */
    protected int smsAmount;

    /**
     * Constructor - creation of the new object
     *
     * @param _id          - contract ID
     * @param _contractNum - contract number
     * @param _startDate   - starting date of the contract
     * @param _endDate     - ending date of the contract
     * @param _owner       - owner of the contract
     * @param _min         -amount of gigabyte
     * @param _gb          -amount of gigabyte
     * @param _sms         -amount of gigabyte
     */
    public Mobile(int _id, int _contractNum, Calendar _startDate, Calendar _endDate, Person _owner, int _min, int _gb, int _sms) {
        super(_id, _contractNum, _startDate, _endDate, _owner);
        if (_min > 0) minuteAmount = _min;
        if (_gb > 0) gigabyteAmount = _gb;
        if (_sms > 0) smsAmount = _sms;

    }

    /**
     * Getter for minuteAmount
     *
     * @return Amount of minute is provided by contract
     */
    int GetMinutes() {
        return minuteAmount;
    }

    /**
     * Getter for gigabyteAmount
     *
     * @return Amount of gigabyte is provided by contract
     */
    int GetGigabytes() {
        return gigabyteAmount;
    }

    /**
     * Getter for smsAmount
     *
     * @return Amount of sms is provided by contract
     */
    int GetSMS() {
        return smsAmount;
    }

    /**
     * Getter for id
     *
     * @return ID of the contract
     */
    public int GetId() {
        return id;
    }

    /**
     * Getter for contractNum
     *
     * @return Contract number
     */
    public int GetContractNum() {
        return contractNum;
    }

    /**
     * Getter for startDate
     *
     * @return Starting date of the contract
     */
    public Calendar GetStartDate() {
        return startDate;
    }

    /**
     * Getter for endDate
     *
     * @return Ending date of the contract
     */
    public Calendar GetEndDate() {
        return endDate;
    }

    /**
     * Getter for owner
     *
     * @return info about owner
     */
    public Person GetOwner() {
        return owner;
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
        if(!super.equals(obj))
            return false;
        Mobile other = (Mobile) obj;
        if (other.minuteAmount == this.minuteAmount) {
            if (other.gigabyteAmount == this.gigabyteAmount) {
                if (other.smsAmount == this.smsAmount) {
                    Contract other2 = (Contract) obj;
                    if (other2 == obj)
                        return true;
                }
                return false;

            }
            return false;

        }
        return false;

    }

    /**
     * Overrides classic method hashcode in java
     *
     * @return Hashcode
     */
    @Override
    public int hashCode() {
        return ((id + contractNum + minuteAmount + gigabyteAmount + smsAmount) % 1000);
    }

    /**
     * Overrides classical function toString
     * and outputs full info about current contract
     *
     * @return Returns string which consists of fields of class in ford [Contract: [field1,field2,...]
     */
    @Override
    public String toString() {
        return "Contract: [Id=" + id
                + ", ContractNumber=" + contractNum
                + ",Expiration date from: " + startDate.get(Calendar.YEAR) + "/" + startDate.get(Calendar.MONTH) + "/" + startDate.get(Calendar.DAY_OF_MONTH)
                + " - " + endDate.get(Calendar.YEAR) + "/" + endDate.get(Calendar.MONTH) + "/" + endDate.get(Calendar.DAY_OF_MONTH)
                + owner
                + ", Amount of minutes: " + minuteAmount
                + ", Amount of minutes: " + gigabyteAmount
                + ", Amount of SMS: " + smsAmount + "]";
    }


}

