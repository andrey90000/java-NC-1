package Contract;

import java.util.Calendar;

import Person.Person;

/**
 * Abstract Class Contract keeps general information about contract.
 *
 * @author Усов Андрей
 */

public class Contract {
    /**
     * field id:contract id
     */
    protected int id;
    /**
     * field contractNum:contract number
     */
    protected int contractNum;
    /**
     * field startDate: starting date of the contract
     */
    protected Calendar startDate;
    /**
     * field startDate: ending date of the contract
     */
    protected Calendar endDate;
    /**
     * field startDate: owner of the contract
     */
    protected Person owner;

    /**
     * Constructor - creation of the new object
     *
     * @param _id          - contract ID
     * @param _contractNum - contract number
     * @param _startDate   - starting date of the contract
     * @param _endDate     - ending date of the contract
     * @param _owner       - owner of the contract
     */
    protected Contract(int _id, int _contractNum, Calendar _startDate, Calendar _endDate, Person _owner) {
        id = _id;
        contractNum = _contractNum;
        startDate = _startDate;
        endDate = _endDate;
        owner = _owner;

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
        Contract other = (Contract) obj;
        if (this.id != other.id)
            return false;
        if (this.contractNum != other.contractNum)
            return false;
        if (this.startDate != other.startDate)
            return false;
        if (this.endDate != other.endDate)
            return false;
        if (!this.owner.equals( other.owner))
            return false;
        return true;
    }

    /**
     * Overrides classic method hashcode in java
     *
     * @return Hashcode
     */
    @Override
    public int hashCode() {
        return ((id + contractNum) % 1000);
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
                + owner + "]";
    }


}

