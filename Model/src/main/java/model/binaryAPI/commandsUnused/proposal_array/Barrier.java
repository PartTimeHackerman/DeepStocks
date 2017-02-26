
package data.binaryAPI.commandsUnused.proposal_array;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * barrier(s) for the contracts to price
 * 
 */
public class Barrier implements Serializable
{

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    @SerializedName("barrier")
    @Expose
    private String barrier;
    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    @SerializedName("barrier2")
    @Expose
    private String barrier2;
    private final static long serialVersionUID = -7468494286335350176L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Barrier() {
    }

    /**
     * 
     * @param barrier
     * @param barrier2
     */
    public Barrier(String barrier, String barrier2) {
        super();
        this.barrier = barrier;
        this.barrier2 = barrier2;
    }

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public String getBarrier() {
        return barrier;
    }

    /**
     * Barrier for the contract (or last digit prediction for digit contracts). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public void setBarrier(String barrier) {
        this.barrier = barrier;
    }

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public String getBarrier2() {
        return barrier2;
    }

    /**
     * Low barrier for the contract (for contracts with two barriers). Contracts less than 24 hours in duration would need a relative barrier (barriers which need +/-), meaning that the entry spot would be adjusted accordingly with that amount to define a barrier.
     * 
     */
    public void setBarrier2(String barrier2) {
        this.barrier2 = barrier2;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(barrier).append(barrier2).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Barrier) == false) {
            return false;
        }
        Barrier rhs = ((Barrier) other);
        return new EqualsBuilder().append(barrier, rhs.barrier).append(barrier2, rhs.barrier2).isEquals();
    }

}
