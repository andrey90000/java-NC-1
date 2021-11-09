package Contract;

import Person.Person;

import java.util.Calendar;

/**
 * Class Television extends Contract class and keeps information about television contract.
 *
 * @author Усов Андрей
 */
public class Television extends Contract {
    /**
     * field channelsPack: name of channels package
     */
    String channelsPack;

    /**
     * Constructor - creation of the new object
     *
     * @param _id          - contract ID
     * @param _contractNum - contract number
     * @param _startDate   - starting date of the contract
     * @param _endDate     - ending date of the contract
     * @param _owner       - owner of the contract
     * @param _chPack      - name of channels package
     */
    public Television(int _id, int _contractNum, Calendar _startDate, Calendar _endDate, Person _owner, String _chPack) {
        super(_id, _contractNum, _startDate, _endDate, _owner);
        channelsPack = _chPack;
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
     * Getter for channelsPack
     *
     * @return Name of channels package
     */
    public String GetChannelPack() {
        return channelsPack;
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

        Television other = (Television) obj;
        if (other.channelsPack == this.channelsPack) {
            Contract other2 = (Contract) obj;
            if (other2 == obj)
                return true;
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
        return ((id + contractNum + channelsPack.length()) % 1000);
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
                + ", Channels package: " + channelsPack + "]";
    }
}
